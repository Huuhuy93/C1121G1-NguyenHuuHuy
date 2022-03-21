package service;

import model.Customer;
import model.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer selectCustomer(Integer customerId);

    public List<Customer> selectAllCustomer();

    public boolean deleteCustomer(Integer customerId) throws SQLException;

    public boolean updateCustomer(Customer customer) throws SQLException;

    public List<CustomerDTO> selectALLCustomerWithDTO();

}
