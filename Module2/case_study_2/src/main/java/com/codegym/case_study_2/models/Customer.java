package com.codegym.case_study_2.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.Validation;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Entity
@Table(name = "customer_f")
public class Customer implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;

    @NotEmpty(message = "Name not empty")
    private String nameCustomer;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthdayCustomer;

    @Pattern(regexp = "^(09(0|1)[0-9]{7})|(\\\\\\\\(84\\\\\\\\)\\\\\\\\+9(0|1)[0-9]{7})$\\\"",message = "Phone number must be 090-091xxxxxxxx")
    private String phoneNumberCustomer;

    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "Email must be abc@abc.abc")
    private String emailCustomer;


    private String addressCustomer;
    @ManyToOne
    @JoinColumn(name = "afk_typeOfCustomer")
    private TypeOfCustomer typeOfCustomer;

    @OneToMany(mappedBy = "customerC", cascade = CascadeType.ALL)
    private List<Contact> contactList;


    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "idRule")
    private UserAdmin userAdmin;

    public UserAdmin getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(UserAdmin userAdmin) {
        this.userAdmin = userAdmin;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public LocalDate getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(LocalDate birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(String phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public TypeOfCustomer getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(TypeOfCustomer typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer() {
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {



    }
}
