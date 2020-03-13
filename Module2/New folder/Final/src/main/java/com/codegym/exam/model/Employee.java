package com.codegym.exam.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class Employee implements Validator {

    @Id
    private Long id;

    @NotEmpty(message = "Name not null")
    private String nameE;
    private String groupE;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthdayE;
    private String genderE;
    @NotEmpty
    @NotEmpty(message = "Phone not null")
    @Pattern(regexp = "^(09(0|1)[0-9]{7})|(\\(84\\)\\+9(0|1)[0-9]{7})$",message = "Phone number must be 090-091xxxxxxxx")
    private String phoneE;
    @NotEmpty
    @NotEmpty(message = "Id card not null")
    private String iCardE;
    @NotEmpty
    @NotEmpty(message = "Email not null")
    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "Email must be abc@abc.abc")
    private String emailE;
    private String addressE;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getGroupE() {
        return groupE;
    }

    public void setGroupE(String groupE) {
        this.groupE = groupE;
    }

    public Date getBirthdayE() {
        return birthdayE;
    }

    public void setBirthdayE(Date birthdayE) {
        this.birthdayE = birthdayE;
    }

    public String getGenderE() {
        return genderE;
    }

    public void setGenderE(String genderE) {
        this.genderE = genderE;
    }

    public String getPhoneE() {
        return phoneE;
    }

    public void setPhoneE(String phoneE) {
        this.phoneE = phoneE;
    }

    public String getiCardE() {
        return iCardE;
    }

    public void setiCardE(String iCardE) {
        this.iCardE = iCardE;
    }

    public String getEmailE() {
        return emailE;
    }

    public void setEmailE(String emailE) {
        this.emailE = emailE;
    }

    public String getAddressE() {
        return addressE;
    }

    public void setAddressE(String addressE) {
        this.addressE = addressE;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Employee employee  = (Employee)o;

        Long id = employee.getId();
        ValidationUtils.rejectIfEmpty(errors,"id","id.empty");

        Date date = employee.getBirthdayE();
        ValidationUtils.rejectIfEmpty(errors,"birthdayE","birthdayE.empty");


    }
}
