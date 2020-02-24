package com.codegym.case_study.repositories;

import com.codegym.case_study.models.TypeOfCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfCustomerRepository extends JpaRepository<TypeOfCustomer,Long> {
}
