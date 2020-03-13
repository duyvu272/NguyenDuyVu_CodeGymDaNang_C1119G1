package com.codegym.case_study_2.services;

import com.codegym.case_study_2.models.AccompanyingServices;
import com.codegym.case_study_2.models.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AccompanyingServiceF {

    Optional<AccompanyingServices> findById(Long id);
    void delete(Long id);
    void save(AccompanyingServices accompanyingServices);
    AccompanyingServices findByIdL(Long id);
    Page<AccompanyingServices> findAll(Pageable pageable);
    Page<AccompanyingServices> findByName(String name, Pageable pageable);
    List<AccompanyingServices> findAllAccService();
}
