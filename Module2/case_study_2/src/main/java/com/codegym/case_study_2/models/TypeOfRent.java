package com.codegym.case_study_2.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_of_rent_f")
public class TypeOfRent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTypeOfRent;

    private String nameTypeOfRent;
    private double priceTypeOfRent;

    @OneToMany(mappedBy = "typeOfRent",cascade = CascadeType.ALL)
    private List<Service> serviceList;

    public TypeOfRent() {
    }

    public Long getIdTypeOfRent() {
        return idTypeOfRent;
    }

    public void setIdTypeOfRent(Long idTypeOfRent) {
        this.idTypeOfRent = idTypeOfRent;
    }

    public String getNameTypeOfRent() {
        return nameTypeOfRent;
    }

    public void setNameTypeOfRent(String nameTypeOfRent) {
        this.nameTypeOfRent = nameTypeOfRent;
    }

    public double getPriceTypeOfRent() {
        return priceTypeOfRent;
    }

    public void setPriceTypeOfRent(double priceTypeOfRent) {
        this.priceTypeOfRent = priceTypeOfRent;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
