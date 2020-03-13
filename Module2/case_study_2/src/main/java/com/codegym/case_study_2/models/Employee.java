package com.codegym.case_study_2.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee_f")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    private String nameEmployee;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdayEm;
    private String idCardEmployee;
    private double salary;
    private String emailEmployee;

    public Employee() {
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public LocalDate getBirthdayEm() {
        return birthdayEm;
    }

    public void setBirthdayEm(LocalDate birthdayEm) {
        this.birthdayEm = birthdayEm;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getPhoneNumberEmployee() {
        return phoneNumberEmployee;
    }

    public void setPhoneNumberEmployee(String phoneNumberEmployee) {
        this.phoneNumberEmployee = phoneNumberEmployee;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    private String addressEmployee;
    private String phoneNumberEmployee;

    @ManyToOne
    @JoinColumn(name = "afk_positionId")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "afk_parts")
    private Parts parts;

    @ManyToOne
    @JoinColumn(name = "afk_degree")
    private Degree degree;

    @OneToMany(mappedBy = "employeeId",cascade =CascadeType.ALL )
    private List<Contact> contactList;

    public Parts getParts() {
        return parts;
    }

    public void setParts(Parts parts) {
        this.parts = parts;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
