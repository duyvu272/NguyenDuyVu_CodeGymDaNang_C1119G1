package com.codegym.case_study_2.repositories;



import com.codegym.case_study_2.models.TypeOfRent;
import com.codegym.case_study_2.models.TypeOfService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TypeOfServiceRepository extends JpaRepository<TypeOfService,Long> {
    @Query("select c from TypeOfService c WHERE c.idTypeOfService =?1")
    TypeOfService findByIdL(Long id);
}
