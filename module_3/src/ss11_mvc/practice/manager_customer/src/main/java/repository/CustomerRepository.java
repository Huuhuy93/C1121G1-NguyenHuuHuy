package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(Integer id);

    void update(Integer id, Customer customer);

    Customer remove(Integer id);
}
