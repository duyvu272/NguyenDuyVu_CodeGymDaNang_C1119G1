package com.codegym.case_study.repositories;

import com.codegym.case_study.models.Parts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartsRepository extends JpaRepository<Parts,Long> {
}
