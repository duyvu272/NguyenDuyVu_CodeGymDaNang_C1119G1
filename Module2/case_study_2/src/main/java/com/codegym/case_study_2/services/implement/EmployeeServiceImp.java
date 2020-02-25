package com.codegym.case_study_2.services.implement;



import com.codegym.case_study_2.models.Employee;
import com.codegym.case_study_2.repositories.EmployeeRepository;
import com.codegym.case_study_2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeRepository repository;


    @Override
    public Optional<Employee> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public Employee findByIdL(Long id) {
        return repository.findByIdL(id);
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Employee> findByName(String name, Pageable pageable) {
        return repository.findByName(name,pageable);
    }


}
