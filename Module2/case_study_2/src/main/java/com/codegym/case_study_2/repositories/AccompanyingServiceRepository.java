package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.AccompanyingServices;
import com.codegym.case_study_2.models.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccompanyingServiceRepository extends JpaRepository<AccompanyingServices,Long> {
    @Query("select c from AccompanyingServices c WHERE c.idAccompanyingServices =?1")
    AccompanyingServices findByIdL(Long id);
}
