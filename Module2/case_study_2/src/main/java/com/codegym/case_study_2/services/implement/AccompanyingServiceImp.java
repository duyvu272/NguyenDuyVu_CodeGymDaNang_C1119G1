package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.AccompanyingServices;
import com.codegym.case_study_2.repositories.AccompanyingServiceRepository;
import com.codegym.case_study_2.services.AccompanyingServiceF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccompanyingServiceImp implements AccompanyingServiceF {

    @Autowired
    AccompanyingServiceRepository repository;

    @Override
    public Optional<AccompanyingServices> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(AccompanyingServices accompanyingServices) {

    }

    @Override
    public AccompanyingServices findByIdL(Long id) {
        return null;
    }

    @Override
    public Page<AccompanyingServices> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<AccompanyingServices> findByName(String name, Pageable pageable) {
        return null;
    }


    @Override
    public List<AccompanyingServices> findAllAccService() {
        return repository.findAll();
    }
}
