package service;

import model.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
