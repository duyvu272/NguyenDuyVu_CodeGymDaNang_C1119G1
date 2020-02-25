package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Long> {
}
