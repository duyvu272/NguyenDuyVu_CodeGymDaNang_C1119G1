package com.codegym.case_study.repositories;

import com.codegym.case_study.models.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree,Long> {
}
