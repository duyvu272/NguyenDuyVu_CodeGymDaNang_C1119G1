package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.TypeOfRent;
import com.codegym.case_study_2.repositories.TypeOfRentRepository;
import com.codegym.case_study_2.services.TypeOfRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeOfRentServiceImp implements TypeOfRentService {

    @Autowired
    TypeOfRentRepository repository;

    @Override
    public Optional<TypeOfRent> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(TypeOfRent typeOfRent) {
        repository.save(typeOfRent);
    }

    @Override
    public TypeOfRent findByIdL(Long id) {
        return repository.findByIdL(id);
    }

    @Override
    public Page<TypeOfRent> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<TypeOfRent> findByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<TypeOfRent> findAllTypeOfRent() {
        return repository.findAll();
    }
}
