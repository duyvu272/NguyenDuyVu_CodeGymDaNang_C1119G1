package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree,Long> {
}
