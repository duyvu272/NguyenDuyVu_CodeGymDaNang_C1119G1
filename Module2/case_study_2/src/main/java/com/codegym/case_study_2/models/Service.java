package com.codegym.case_study_2.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import org.hibernate.validator.constraints.Range;
@Entity
@Table(name = "service_f")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    @NotEmpty
    private String nameService;
    @NotEmpty
    @Min(1)
    private int numberOfFloor;
    @NotEmpty
    @Min(40)
    private double areas;
    @NotEmpty
    @Range(min = 1,max = 5)
    private int maxAmountPeople;
    @NotEmpty
    @Min(1)
    private double priceService;

    @Lob
    private String urlImg;

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

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
        return this.typeOfRent;
    }

    public void setTypeOfRent(TypeOfRent typeOfRent) {
        this.typeOfRent = typeOfRent;
    }
}
