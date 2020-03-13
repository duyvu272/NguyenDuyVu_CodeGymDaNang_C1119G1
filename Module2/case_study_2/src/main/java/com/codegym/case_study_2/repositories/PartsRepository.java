package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Parts;
import com.codegym.case_study_2.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PartsRepository extends JpaRepository<Parts,Long> {
    @Query("select c from Parts c WHERE c.idParts =?1")
    Parts findByIdL(Long id);
}
