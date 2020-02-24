package com.codegym.case_study.services;

import com.codegym.case_study.models.Customer;
import com.codegym.case_study.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> findById(Long id);
    void delete(Long id);
    void save(Employee employee);
    Employee findByIdL(Long id);
    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findByName(String name,Pageable pageable);

}
