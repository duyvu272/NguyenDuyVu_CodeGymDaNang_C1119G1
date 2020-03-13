package com.codegym.case_study_2.services;

import com.codegym.case_study_2.models.TypeOfRent;
import com.codegym.case_study_2.models.TypeOfService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TypeOfServiceS {

    Optional<TypeOfService> findById(Long id);
    void delete(Long id);
    void save(TypeOfService typeOfService);
    TypeOfService findByIdL(Long id);
    Page<TypeOfService> findAll(Pageable pageable);
    Page<TypeOfService> findByName(String name, Pageable pageable);
    List<TypeOfService> findAllTypeOfServiceS();
}
