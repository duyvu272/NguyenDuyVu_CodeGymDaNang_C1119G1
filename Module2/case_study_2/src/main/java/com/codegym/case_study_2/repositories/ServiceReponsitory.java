package com.codegym.case_study_2.repositories;



import com.codegym.case_study_2.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceReponsitory extends JpaRepository<Service,Long> {
}
