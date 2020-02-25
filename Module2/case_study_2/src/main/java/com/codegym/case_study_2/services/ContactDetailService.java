package com.codegym.case_study_2.services;



import com.codegym.case_study_2.models.ContactDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ContactDetailService {
    Optional<ContactDetails> findById(Long id);
    void delete(Long id);
    void save(ContactDetails details);
    ContactDetails findByIdL(Long id);
    Page<ContactDetails> findAll(Pageable pageable);
    Page<ContactDetails> findByName(String name, Pageable pageable);

}
