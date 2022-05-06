package service;

import model.Customer;
import model.CustomerDTO;
import model.CustomerType;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer selectCustomer(Integer customerId);

    public List<Customer> selectAllCustomer();

    public boolean deleteCustomer(Integer customerId) throws SQLException;

    public boolean updateCustomer(Customer customer) throws SQLException;

    public List<CustomerDTO> selectALLCustomerWithDTO();

    public List<CustomerType> getAllCustomertype();

    public List<CustomerDTO> searchByName(String name);

    public List<CustomerDTO> sortByName();



}
