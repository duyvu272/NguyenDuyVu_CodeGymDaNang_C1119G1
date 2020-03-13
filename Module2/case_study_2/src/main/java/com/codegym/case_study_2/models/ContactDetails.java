package com.codegym.case_study_2.models;

import javax.persistence.*;

@Entity
@Table(name = "contact_detail")
public class ContactDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContactDetails;

    private int amountContactDetails;



    public ContactDetails() {
    }

    public Long getIdContactDetails() {
        return idContactDetails;
    }

    public void setIdContactDetails(Long idContactDetails) {
        this.idContactDetails = idContactDetails;
    }

    public int getAmountContactDetails() {
        return amountContactDetails;
    }

    public void setAmountContactDetails(int amountContactDetails) {
        this.amountContactDetails = amountContactDetails;
    }

    public AccompanyingServices getAccompanyingServices() {
        return accompanyingServices;
    }

    public void setAccompanyingServices(AccompanyingServices accompanyingServices) {
        this.accompanyingServices = accompanyingServices;
    }
    @ManyToOne
    @JoinColumn(name = "afk_contactDT_AccService")
    private AccompanyingServices accompanyingServices;

    @ManyToOne
    @JoinColumn(name = "afk_contactDT_contact")
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
