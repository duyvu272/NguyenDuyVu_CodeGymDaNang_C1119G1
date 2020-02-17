package customer_content;

import java.util.Set;

public class Customer {
    String name;
    String birthday;
    String address;
    String picture;
    Set<Customer> customers;
    public Customer(String name, String birthday, String address, String picture) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.picture = picture;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
