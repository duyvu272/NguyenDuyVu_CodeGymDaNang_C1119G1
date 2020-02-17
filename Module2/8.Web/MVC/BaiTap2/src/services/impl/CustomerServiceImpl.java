package services.impl;

import customer_content.Customer;
import services.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> map;

    static {
        map = new HashMap<>();
        map.put(1, new Customer(1, "goku", "22/02/1992", "Japan", "/image/goku.jpg"));
        map.put(2, new Customer(2, "cadic", "22/02/1992", "Japan", "/image/goku.jpg"));
        map.put(3, new Customer(3, "kirilin", "22/02/1992", "Japan", "/image/goku.jpg"));
        map.put(4, new Customer(4, "picolo", "22/02/1992", "Japan", "/image/goku.jpg"));
        map.put(5, new Customer(5, "gohan", "22/02/1992", "Japan", "/image/goku.jpg"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void save(Customer customer) {
        map.put(map.size() + 1, customer);
    }

    @Override
    public void update(int id, Customer customer) {
        map.put(id, customer);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Customer findById(int id) {
        return  map.get(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customers = findAll();
        List<Customer> customers1 = new ArrayList<>();
        for (Customer cus:customers
             ) {if(cus.getName().equalsIgnoreCase(name)){
                 customers1.add(cus);
        }

        }
        return customers1;
    }


}
