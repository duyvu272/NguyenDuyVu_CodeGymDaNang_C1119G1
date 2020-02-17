package services;

import customer_content.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    void update(int id,Customer customer);
    void remove(int id);
    Customer findById(int id);
    List<Customer> findByName(String name);

}
