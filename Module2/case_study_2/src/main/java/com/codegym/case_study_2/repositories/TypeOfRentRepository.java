package com.codegym.case_study_2.repositories;



import com.codegym.case_study_2.models.Service;
import com.codegym.case_study_2.models.TypeOfRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TypeOfRentRepository extends JpaRepository<TypeOfRent,Long> {
    @Query("select c from TypeOfRent c WHERE c.idTypeOfRent =?1")
    TypeOfRent findByIdL(Long id);
}
