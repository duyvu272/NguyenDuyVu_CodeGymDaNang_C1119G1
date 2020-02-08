package controllers;

import commons.YearOldComarator;
import models.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer, Customer customer1) {
        if(customer.getName().compareTo(customer1.getName())==0){
            return new YearOldComarator().compare(customer,customer1);
        }else
            return customer.getName().compareTo(customer1.getName());
    }
}
