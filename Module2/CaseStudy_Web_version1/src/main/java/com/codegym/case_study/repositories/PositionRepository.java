package com.codegym.case_study.repositories;

import com.codegym.case_study.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Long> {
}
