package com.codegym.case_study.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "degree_f")
public class Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDegree;


    private String nameDegree;

    public Degree() {
    }

    public Long getIdDegree() {
        return idDegree;
    }

    public void setIdDegree(Long idDegree) {
        this.idDegree = idDegree;
    }

    public String getNameDegree() {
        return nameDegree;
    }

    public void setNameDegree(String nameDegree) {
        this.nameDegree = nameDegree;
    }



    @OneToMany(mappedBy = "degree",cascade = CascadeType.ALL)
    private List<Employee> customerList;

    public List<Employee> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Employee> customerList) {
        this.customerList = customerList;
    }
}
