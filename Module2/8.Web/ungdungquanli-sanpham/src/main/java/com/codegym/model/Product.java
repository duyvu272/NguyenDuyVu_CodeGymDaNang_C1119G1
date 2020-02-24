package com.codegym.model;

public class Product {
    private int id;
    private String productName;
    private String madeIn;
    private String description;
    private String image;

    public Product() {
    }

    public Product(int id, String productName, String madeIn, String description, String imgage) {
        this.id = id;
        this.productName = productName;
        this.madeIn = madeIn;
        this.description = description;
        this.image = imgage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String imgage) {
        this.image = imgage;
    }
}
