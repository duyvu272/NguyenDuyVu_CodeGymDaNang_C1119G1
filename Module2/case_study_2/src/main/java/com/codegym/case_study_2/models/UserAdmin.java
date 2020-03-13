package com.codegym.case_study_2.models;

import javax.persistence.*;

@Entity
public class UserAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRule;

    private String userName;
    private String email;
    private Boolean role;

    @OneToOne(mappedBy = "userAdmin")
    private Customer customer;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UserAdmin() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdRule() {
        return idRule;
    }

    public void setIdRule(Long idRule) {
        this.idRule = idRule;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }
}
