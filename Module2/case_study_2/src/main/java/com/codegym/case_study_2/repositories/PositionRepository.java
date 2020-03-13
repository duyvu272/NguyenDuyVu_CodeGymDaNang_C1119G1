package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Position;
import com.codegym.case_study_2.models.TypeOfService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PositionRepository extends JpaRepository<Position,Long> {
    @Query("select c from Position c WHERE c.idPosition =?1")
    Position findByIdL(Long id);
}
