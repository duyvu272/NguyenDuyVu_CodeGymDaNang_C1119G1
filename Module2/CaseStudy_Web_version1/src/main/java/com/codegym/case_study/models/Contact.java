package com.codegym.case_study.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "contact_f")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContact;
    private String nameContact;
    private LocalDate startDate;
    private LocalDate endDate;
    private double downPayment;

    public Contact() {
    }

    private double totalMoney;

    @ManyToOne
    @JoinColumn(name = "afk_employee_contact")
    private Employee employeeId;

    @ManyToOne
    @JoinColumn(name = "afk_service_contact")
    private Service service;

    public Long getIdContact() {
        return idContact;
    }

    @OneToMany(mappedBy = "contact")
    private List<ContactDetails> contactDetails;

    public List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public void setIdContact(Long idContact) {
        this.idContact = idContact;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    @ManyToOne
    @JoinColumn(name = "afk_contact_customer")
    private Customer customerC;

    public Customer getCustomer() {
        return customerC;
    }

    public void setCustomer(Customer customer) {
        this.customerC = customer;
    }


}
