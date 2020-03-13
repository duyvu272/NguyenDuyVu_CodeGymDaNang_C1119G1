package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.ContactDetails;
import com.codegym.case_study_2.repositories.ContactDetailRepository;
import com.codegym.case_study_2.services.ContactDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ContactDetailServiceImp implements ContactDetailService {


    @Autowired
    ContactDetailRepository repository;

    @Override
    public Optional<ContactDetails> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(ContactDetails details) {
        repository.save(details);
    }

    @Override
    public ContactDetails findByIdL(Long id) {
        return repository.findByIdL(id);
    }

    @Override
    public Page<ContactDetails> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }





}
