package com.codegym.exam.service;

import com.codegym.exam.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    void delete(Long id);
    void save(Employee employee);
    Employee findByIdL(Long id);
    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findByName(String name, Pageable pageable);
    List<Employee> findAllEmployee();


}
