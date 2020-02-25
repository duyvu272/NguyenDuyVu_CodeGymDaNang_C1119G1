package com.example.demo.services;


import com.example.demo.models.ContactDetails;
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
