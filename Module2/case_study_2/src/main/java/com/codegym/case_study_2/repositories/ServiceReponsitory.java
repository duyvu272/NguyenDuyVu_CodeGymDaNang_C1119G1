package com.codegym.case_study_2.repositories;



import com.codegym.case_study_2.models.Employee;
import com.codegym.case_study_2.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServiceReponsitory extends JpaRepository<Service,Long> {
    @Query("select c from Service c WHERE c.idService =?1")
    Service findByIdL(Long id);

    @Query("select c from Service c where c.nameService like  ?1%")
    Page<Service> findByName(String name, Pageable pageable);
}
