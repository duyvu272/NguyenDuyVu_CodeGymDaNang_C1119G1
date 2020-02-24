package com.codegym.case_study.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_f")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idService;
    private String nameService;
    private int numberOfFloor;
    private double areas;
    private int maxAmountPeople;
    private double priceService;

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public double getAreas() {
        return areas;
    }

    public void setAreas(double areas) {
        this.areas = areas;
    }

    public int getMaxAmountPeople() {
        return maxAmountPeople;
    }

    public void setMaxAmountPeople(int maxAmountPeople) {
        this.maxAmountPeople = maxAmountPeople;
    }

    public double getPriceService() {
        return priceService;
    }

    public void setPriceService(double priceService) {
        this.priceService = priceService;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TypeOfService getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(TypeOfService typeOfService) {
        this.typeOfService = typeOfService;
    }

    public Service() {
    }

    private String status;

    @ManyToOne
    @JoinColumn(name = "afk_typeOfService")
    private TypeOfService typeOfService;


    @OneToMany(mappedBy = "service",cascade = CascadeType.ALL)
    private List<Contact> contactList;

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
    @ManyToOne
    @JoinColumn(name = "afk_typeOfRent_service")
    private TypeOfRent typeOfRent;

    public TypeOfRent getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(TypeOfRent typeOfRent) {
        this.typeOfRent = typeOfRent;
    }
}
