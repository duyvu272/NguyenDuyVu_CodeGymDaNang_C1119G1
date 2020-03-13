package com.codegym.case_study_2.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "contact_f")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContact;
    @NotEmpty(message = "Name not empty")
    private String nameContact;

    @NotEmpty(message = "Start date not empty")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate startDate;

    @NotEmpty(message = "End date not empty")
    @Future
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate endDate;

    @NotEmpty(message = "DownPayment not empty")
    @Min(value = 1,message = "DownPayment more than 0")
    private double downPayment;

    public Contact() {
    }
    @NotEmpty
    @Min(1)
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

    public Customer getCustomerC() {
        return customerC;
    }

    public void setCustomerC(Customer customerC) {
        this.customerC = customerC;
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

    @Override
    public String toString() {
        return "Contact{" +
                "idContact=" + idContact +
                ", nameContact='" + nameContact + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", downPayment=" + downPayment +
                ", totalMoney=" + totalMoney +
                ", employeeId=" + employeeId +
                ", service=" + service +
                ", customerC=" + customerC +
                '}';
    }
}
