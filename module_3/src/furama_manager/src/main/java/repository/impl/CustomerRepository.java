package repository.impl;

import model.Customer;
import model.CustomerDTO;
import model.CustomerType;
import repository.BaseFuramaRepository;
import repository.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_name, customer_birthday, " +
            " customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id) " +
            " VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CUSTOMER_BY_ID = "select customer_id, customer_name, customer_birthday ,customer_gender, " +
            " customer_id_card, customer_phone, customer_email, customer_address, customer_type_id " +
            " from customer where customer_id =?;";
    private static final String SELECT_ALL_CUSTOMER = "select * from customer;";

    private static final String SELECT_ALL_CUSTOMER_TYPE = "select * from customer_type;";

    private static final String SELECT_ALL_CUSTOMER_JOIN_CUSTOMER_TYPE = "select customer.customer_id, customer.customer_name, customer.customer_birthday, customer.customer_gender, customer.customer_id_card, customer.customer_phone, customer.customer_email, customer.customer_address, customer_type.customer_type_name\n" +
            "from customer join customer_type on customer.customer_type_id = customer_type.customer_type_id\n" +
            "order by customer_id;";

    private static final String DELETE_CUSTOMER_SQL = "delete from customer where customer_id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "update customer set customer_name = ?,customer_birthday= ?, " +
            " customer_gender =?, customer_id_card =?, customer_phone =?, customer_email =?, customer_address =?, " +
            " customer_type_id=?   where customer_id = ?;";

    private BaseFuramaRepository baseFuramaRepository = new BaseFuramaRepository();


    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        Connection connection = null;
        try {
            connection = baseFuramaRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerBirthday());
            preparedStatement.setInt(3, customer.getCustomerGender());
            preparedStatement.setString(4, customer.getCustomerIdCard());
            preparedStatement.setString(5, customer.getCustomerPhone());
            preparedStatement.setString(6, customer.getCustomerEmail());
            preparedStatement.setString(7, customer.getCustomerAddress());
            preparedStatement.setInt(8, customer.getCustomerTypeId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Override
    public Customer selectCustomer(Integer customerId) {
        Customer customerSelect = null;
        Connection connection = null;

        try {
            connection = baseFuramaRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                Integer customerGender = resultSet.getInt("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                Integer customerTypeId = resultSet.getInt("customer_type_id");
                customerSelect = new Customer(customerId, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress, customerTypeId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return customerSelect;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        Connection connection = null;

        try {
            connection = baseFuramaRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                Integer customerGender = resultSet.getInt("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                Integer customerTypeId = resultSet.getInt("customer_type_id");
                customers.add(new Customer(customerId, customerName, customerBirthday, customerGender, customerIdCard,
                        customerPhone, customerEmail, customerAddress, customerTypeId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return customers;
    }

    @Override
    public List<CustomerDTO> selectALLCustomerWithDTO() {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        Connection connection = null;

        try {
            connection = baseFuramaRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_JOIN_CUSTOMER_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                Integer customerGender = resultSet.getInt("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                String customerTypeName = resultSet.getString("customer_type_name");
                customerDTOList.add(new CustomerDTO(customerId, customerName, customerBirthday, customerGender, customerIdCard,
                        customerPhone, customerEmail, customerAddress, customerTypeName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return customerDTOList;
    }

    @Override
    public List<CustomerType> getAllCustomertype() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = baseFuramaRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Integer customerTypeId = resultSet.getInt("customer_type_id");
                String customerTypeName = resultSet.getString("customer_type_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerTypeList;
    }

    @Override
    public boolean deleteCustomer(Integer customerId) throws SQLException {
        boolean rowDelete = false;
        Connection connection = null;
        try {
            connection = baseFuramaRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_SQL);
            preparedStatement.setInt(1, customerId);
            rowDelete = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rowDelete;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        boolean rowUpdate = false;
        Connection connection = null;
        try {
            connection = baseFuramaRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerBirthday());
            preparedStatement.setInt(3, customer.getCustomerGender());
            preparedStatement.setString(4, customer.getCustomerIdCard());
            preparedStatement.setString(5, customer.getCustomerPhone());
            preparedStatement.setString(6, customer.getCustomerEmail());
            preparedStatement.setString(7, customer.getCustomerAddress());
            preparedStatement.setInt(8, customer.getCustomerTypeId());
            preparedStatement.setInt(9, customer.getCustomerId());

            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rowUpdate;
    }

}
