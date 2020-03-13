package com.codegym.exam.service.imp;

import com.codegym.exam.model.Employee;
import com.codegym.exam.reponsitory.EmployeeReponsitory;
import com.codegym.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeReponsitory reponsitory;
    @Override
    public void delete(Long id) {
        reponsitory.deleteById(id);
    }

    @Override
    public void save(Employee employee) {
        reponsitory.save(employee);
    }

    @Override
    public Employee findByIdL(Long id) {
        return reponsitory.findByIdL(id);
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return reponsitory.findAll(pageable);
    }

    @Override
    public Page<Employee> findByName(String name, Pageable pageable) {
        return reponsitory.findByName(name,pageable);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return reponsitory.findAll();
    }
}
