package com.codegym.case_study.repositories;

import com.codegym.case_study.models.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetailRepository extends JpaRepository<ContactDetails,Long> {
}
