package com.codegm.finalexam.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeOfProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;

    private String nameType;

    public TypeOfProduct() {
    }

    @OneToMany(mappedBy = "typeProduct",cascade = CascadeType.ALL)
    private List<Product>productList;

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
