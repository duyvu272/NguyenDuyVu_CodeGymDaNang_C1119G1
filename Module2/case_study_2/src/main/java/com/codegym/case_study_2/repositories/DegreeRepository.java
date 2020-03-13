package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Degree;
import com.codegym.case_study_2.models.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DegreeRepository extends JpaRepository<Degree,Long> {
    @Query("select c from Degree c WHERE c.idDegree =?1")
    Degree findByIdL(Long id);
}
