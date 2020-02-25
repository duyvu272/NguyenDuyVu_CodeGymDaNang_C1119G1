package com.example.demo.repositories;


import com.example.demo.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("select c from Employee c WHERE c.idEmployee =?1")
    Employee findByIdL(Long id);

    Page<Employee> findAll(Pageable pageable);

    @Query("select c from Employee c where c.nameEmployee like  ?1%")
    Page<Employee> findByName(String name, Pageable pageable);

//    @Query("select  b from Employee b where b.category.id = ?1")
//    Page<Employee> findBlogByCategories(Long id,Pageable pageable);

}
