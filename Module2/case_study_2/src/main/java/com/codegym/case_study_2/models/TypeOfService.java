package com.codegym.case_study_2.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_of_service_f")
public class TypeOfService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTypeOfService;

    private String nameTypeOfService;

    @OneToMany(mappedBy = "typeOfService",cascade = CascadeType.ALL)
    private List<Service> serviceList;

    public TypeOfService() {
    }

    public Long getIdTypeOfService() {
        return idTypeOfService;
    }

    public void setIdTypeOfService(Long idTypeOfService) {
        this.idTypeOfService = idTypeOfService;
    }

    public String getNameTypeOfService() {
        return nameTypeOfService;
    }

    public void setNameTypeOfService(String nameTypeOfService) {
        this.nameTypeOfService = nameTypeOfService;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }


}
