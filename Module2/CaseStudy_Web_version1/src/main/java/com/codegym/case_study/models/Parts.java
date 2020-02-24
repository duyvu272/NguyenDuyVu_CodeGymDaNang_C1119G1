package com.codegym.case_study.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parts_f")
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idParts;


    private String nameParts;

    public Parts() {
    }

    public Long getIdParts() {
        return idParts;
    }

    public void setIdParts(Long idParts) {
        this.idParts = idParts;
    }

    public String getNameParts() {
        return nameParts;
    }

    public void setNameParts(String nameParts) {
        this.nameParts = nameParts;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @OneToMany(mappedBy = "parts",cascade = CascadeType.ALL)
    private List<Employee> employeeList;

}
