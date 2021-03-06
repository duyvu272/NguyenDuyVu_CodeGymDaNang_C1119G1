package com.example.demo.services;


import com.example.demo.models.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ContactService {
    Optional<Contact> findById(Long id);
    void delete(Long id);
    void save(Contact contact);
    Contact findByIdL(Long id);
    Page<Contact> findAll(Pageable pageable);
    Page<Contact> findByName(String name, Pageable pageable);

}
