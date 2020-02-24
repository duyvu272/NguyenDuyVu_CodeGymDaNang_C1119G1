package com.codegym.case_study.repositories;

import com.codegym.case_study.models.TypeOfService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfServiceRepository extends JpaRepository<TypeOfService,Long> {
}
