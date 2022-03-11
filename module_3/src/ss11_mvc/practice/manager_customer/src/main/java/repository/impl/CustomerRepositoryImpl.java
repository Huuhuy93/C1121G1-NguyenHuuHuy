package repository.impl;

import model.Customer;
import repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(101, "Nguyen Van A", "abc@gmail.com", "Da Nang"));
        customerList.add(new Customer(103, "Le Huu B", "abcd@gmail.com", "Quang Nam"));
        customerList.add(new Customer(105, "Nguyen Ngoc Ha", "ab@gmail.com", "Hue"));
        customerList.add(new Customer(106, "Nguyen Van C", "abcde@gmail.com", "Khanh Hoa"));
        customerList.add(new Customer(108, "Le Hung Cuong", "abccc@gmail.com", "Ha Noi"));
        customerList.add(new Customer(109, "Bui Ngoc Hung", "abcdee@gmail.com", "Sai Gon"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer findById(Integer id) {
        for (Customer customer: customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void update(Integer id, Customer customer) {
        for (Customer customers: customerList) {
            if (customer.getId().equals(id)){
                customers.setName(customer.getName());
                customers.setEmail(customer.getEmail());
                customers.setAddress(customer.getAddress());
            }
        }
    }

    @Override
    public Customer remove(Integer id) {
        for (int i = 0; i < customerList.size(); i++){
            if (customerList.get(i).getId().equals(id)){
                customerList.remove(i);
                break;
            }
        }
        return null;
    }
}
