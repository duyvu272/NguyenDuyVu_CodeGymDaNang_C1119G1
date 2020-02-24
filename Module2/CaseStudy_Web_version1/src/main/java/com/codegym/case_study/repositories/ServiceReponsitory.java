package com.codegym.case_study.repositories;

import com.codegym.case_study.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceReponsitory extends JpaRepository<Service,Long> {
}
