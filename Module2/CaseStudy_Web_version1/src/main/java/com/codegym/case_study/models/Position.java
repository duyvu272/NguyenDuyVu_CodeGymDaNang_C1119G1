package com.codegym.case_study.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "position_f")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPosition;


    private String namePosition;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    public Long getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Long idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Position() {
    }

}
