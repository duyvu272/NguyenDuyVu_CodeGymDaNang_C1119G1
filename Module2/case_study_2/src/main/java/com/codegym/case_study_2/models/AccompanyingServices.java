package com.codegym.case_study_2.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accompanying_services_f")
public class AccompanyingServices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAccompanyingServices;

    private String nameAccompanyingServices;
    private double priceAccompanyingServices;
    private String statusAccompanyingServices;
    private int unitAccompanyingServices;

    @OneToMany(mappedBy = "accompanyingServices")
    private List<ContactDetails> contactDetails;

    public AccompanyingServices() {
    }

    public Long getIdAccompanyingServices() {
        return idAccompanyingServices;
    }

    public void setIdAccompanyingServices(Long idAccompanyingServices) {
        this.idAccompanyingServices = idAccompanyingServices;
    }

    public String getNameAccompanyingServices() {
        return nameAccompanyingServices;
    }

    public void setNameAccompanyingServices(String nameAccompanyingServices) {
        this.nameAccompanyingServices = nameAccompanyingServices;
    }

    public double getPriceAccompanyingServices() {
        return priceAccompanyingServices;
    }

    public void setPriceAccompanyingServices(double priceAccompanyingServices) {
        this.priceAccompanyingServices = priceAccompanyingServices;
    }

    public String getStatusAccompanyingServices() {
        return statusAccompanyingServices;
    }

    public void setStatusAccompanyingServices(String statusAccompanyingServices) {
        this.statusAccompanyingServices = statusAccompanyingServices;
    }

    public int getUnitAccompanyingServices() {
        return unitAccompanyingServices;
    }

    public void setUnitAccompanyingServices(int unitAccompanyingServices) {
        this.unitAccompanyingServices = unitAccompanyingServices;
    }

    public List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
    }


}
