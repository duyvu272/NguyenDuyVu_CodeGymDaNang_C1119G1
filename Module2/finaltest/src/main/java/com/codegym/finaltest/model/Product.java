package com.codegym.finaltest.model;

import org.hibernate.exception.DataException;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name not empty")
    @Size(min = 5,max = 30,message = "too sort or too long(5-3 character)")
    private String nameProduct;
    @NotEmpty(message = "Price not empty")
    @Min(value = 1,message = "must be more than 0")
    private double price;
    @NotEmpty(message = "Amount not empty")
    @Min(value = 0,message = "must be more than 0")
    private int amount;
    private Date createDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "afk_typeOfProduct")
    private TypeOfProduct typeProduct;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeOfProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeOfProduct typeProduct) {
        this.typeProduct = typeProduct;
    }
}
