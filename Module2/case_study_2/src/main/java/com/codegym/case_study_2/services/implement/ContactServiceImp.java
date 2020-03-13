package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.Contact;
import com.codegym.case_study_2.repositories.ContactReponsitory;
import com.codegym.case_study_2.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImp implements ContactService {

    @Autowired
    ContactReponsitory reponsitory;



    @Override
    public Optional<Contact> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
            reponsitory.deleteById(id);
    }

    @Override
    public void save(Contact contact) {
            reponsitory.save(contact);
    }

    @Override
    public Contact findByIdL(Long id) {
        return reponsitory.findByIdL(id);
    }

    @Override
    public Page<Contact> findAll(Pageable pageable) {
        return reponsitory.findAll(pageable);
    }

    @Override
    public Page<Contact> findByName(String name, Pageable pageable) {
        return reponsitory.findByName(name,pageable);
    }

    @Override
    public List<Contact> findAllContact() {
        return reponsitory.findAll();
    }
}
