package com.codegym.case_study_2.services;


import com.codegym.case_study_2.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findById(Long id);
    void delete(Long id);
    void save(Customer customer);
    Customer findByIdL(Long id);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findByName(String name, Pageable pageable);
    List<Customer> findAllCustomer();
}
