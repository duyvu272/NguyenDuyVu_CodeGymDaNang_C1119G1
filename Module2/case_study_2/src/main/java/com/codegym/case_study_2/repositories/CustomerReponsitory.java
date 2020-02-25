package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReponsitory extends JpaRepository<Customer,Long> {

    @Query("select c from Customer c WHERE c.idCustomer =?1")
    Customer findByIdL(Long id);

    Page<Customer> findAll(Pageable pageable);

    @Query("select c from Customer c where c.nameCustomer like  ?1%")
    Page<Customer> findByName(String name, Pageable pageable);
}
