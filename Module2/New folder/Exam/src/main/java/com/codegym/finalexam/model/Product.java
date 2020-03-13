package com.codegym.finalexam.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Product implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name not empty")
    private String name;
    private String type;
    private Date date;

    @NotNull(message = "Price not empty")
    @Min(value = 1,message = "must ber more than 0")
    //@Pattern(regexp = "^(\\d)*(\\.)?(\\d)*$",message = "must be number")
    private double price;

    @NotNull(message = "Amount not empty")
    @Min(value = 1,message = "Must be more than 0")
    //@Pattern(regexp = "^(\\d)*$",message = "must be number")
    private int amount;
    private String description;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Product product = (Product)o;
        int amount = product.getAmount();
        String name = product.getName();
        ValidationUtils.rejectIfEmpty(errors,"amount","amount.empty");
        String a =Integer.toString(amount);
        if(!a.matches("^(\\d)*$")){
            errors.rejectValue("amount","amount.match");
        }
        double price= product.getPrice();
        String priceConvertt = Double.toString(price);

        if(!priceConvertt.matches("^(\\d)*(\\.)?(\\d)*$")){
            errors.rejectValue("price","price.match");
        }


    }
}
