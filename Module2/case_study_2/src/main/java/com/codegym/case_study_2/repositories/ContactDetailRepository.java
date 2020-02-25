package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetailRepository extends JpaRepository<ContactDetails,Long> {
}
