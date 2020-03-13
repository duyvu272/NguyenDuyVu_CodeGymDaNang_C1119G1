package com.codegym.case_study_2.services;

import com.codegym.case_study_2.models.TypeOfCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TypeOfCustomerService {
    Optional<TypeOfCustomer> findById(Long id);
    void delete(Long id);
    void save(TypeOfCustomer typeOfCustomer);
    TypeOfCustomer findByIdL(Long id);
    Page<TypeOfCustomer> findAll(Pageable pageable);
    Page<TypeOfCustomer> findByName(String name,Pageable pageable);
    List<TypeOfCustomer> findAllC();


}
