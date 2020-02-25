package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Parts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartsRepository extends JpaRepository<Parts,Long> {
}
