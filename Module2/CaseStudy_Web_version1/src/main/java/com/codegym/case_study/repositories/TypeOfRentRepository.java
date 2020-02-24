package com.codegym.case_study.repositories;

import com.codegym.case_study.models.TypeOfRent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfRentRepository extends JpaRepository<TypeOfRent,Long> {
}
