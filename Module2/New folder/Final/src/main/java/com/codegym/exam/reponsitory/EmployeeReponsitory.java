package com.codegym.exam.reponsitory;

import com.codegym.exam.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeReponsitory extends JpaRepository<Employee,Long> {
    @Query("select c from Employee c WHERE c.id =?1")
    Employee findByIdL(Long id);

    Page<Employee> findAll(Pageable pageable);

    @Query("select c from Employee c where c.iCardE like ?1% ")
    Page<Employee> findByName(String name, Pageable pageable);
}
