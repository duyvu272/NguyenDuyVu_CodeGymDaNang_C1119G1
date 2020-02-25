package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_of_customer_f")
public class TypeOfCustomer {
    public Long getIdTypeOfCustomer() {
        return idTypeOfCustomer;
    }

    public void setIdTypeOfCustomer(Long idTypeOfCustomer) {
        this.idTypeOfCustomer = idTypeOfCustomer;
    }

    public String getNameTypeOfCustomer() {
        return nameTypeOfCustomer;
    }

    public void setNameTypeOfCustomer(String nameTypeOfCustomer) {
        this.nameTypeOfCustomer = nameTypeOfCustomer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTypeOfCustomer;

    public TypeOfCustomer() {
    }

    private String nameTypeOfCustomer;

    @OneToMany(mappedBy = "typeOfCustomer",cascade = CascadeType.ALL)
    private List<Customer> customerList;
}
