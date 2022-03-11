package service.impl;

import model.Customer;
import repository.CustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @Override
    public Customer findById(Integer id) {
        Customer customer = this.customerRepository.findById(id);
        return customer;
    }

    @Override
    public void update(Integer id, Customer customer) {
        if (customer.getName().equals("")){
            System.out.println("Tên không được để trống!!!");
            return;
        }
        if (customer.getEmail().equals("")){
            System.out.println("Email không được để trống!!!");
            return;
        }
        if (customer.getAddress().equals("")){
            System.out.println("Địa chỉ không được để trống!!!");
            return;
        }
        if (this.customerRepository.findById(id) == null){
            System.out.println("id không tồn tạo trong database");
            return;
        }
        this.customerRepository.update(id, customer);
    }

    @Override
    public void remove(Integer id) {
        Customer customer = this.customerRepository.remove(id);
    }
}
