package com.codegym.case_study_2.services;


import com.codegym.case_study_2.models.Employee;
import com.codegym.case_study_2.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ServicesFuramaService {
    Optional<Service> findById(Long id);
    void delete(Long id);
    void save(Service service);
    Service findByIdL(Long id);
    Page<Service> findAll(Pageable pageable);
    Page<Service> findByName(String name, Pageable pageable);
    List<Service> findAllService();
}
