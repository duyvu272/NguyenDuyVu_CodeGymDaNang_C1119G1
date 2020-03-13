package com.codegym.case_study_2.services;

import com.codegym.case_study_2.models.Employee;
import com.codegym.case_study_2.models.TypeOfRent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TypeOfRentService {

    Optional<TypeOfRent> findById(Long id);
    void delete(Long id);
    void save(TypeOfRent typeOfRent);
    TypeOfRent findByIdL(Long id);
    Page<TypeOfRent> findAll(Pageable pageable);
    Page<TypeOfRent> findByName(String name, Pageable pageable);
    List<TypeOfRent> findAllTypeOfRent();


}
