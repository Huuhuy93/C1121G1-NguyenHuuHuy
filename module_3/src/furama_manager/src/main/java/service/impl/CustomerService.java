package service.impl;

import model.Customer;
import model.CustomerDTO;
import model.CustomerType;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        iCustomerRepository.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(Integer customerId) {
        return iCustomerRepository.selectCustomer(customerId);
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return iCustomerRepository.selectAllCustomer();
    }

    @Override
    public boolean deleteCustomer(Integer customerId) throws SQLException {
        return iCustomerRepository.deleteCustomer(customerId);
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        return iCustomerRepository.updateCustomer(customer);
    }

    @Override
    public List<CustomerDTO> selectALLCustomerWithDTO() {
        return iCustomerRepository.selectALLCustomerWithDTO();
    }

    @Override
    public List<CustomerType> getAllCustomertype() {
        return iCustomerRepository.getAllCustomertype();
    }

    @Override
    public List<CustomerDTO> searchByName(String name) {
        return iCustomerRepository.searchByName(name);
    }

    @Override
    public List<CustomerDTO> sortByName() {
        return iCustomerRepository.sortByName();
    }
}
