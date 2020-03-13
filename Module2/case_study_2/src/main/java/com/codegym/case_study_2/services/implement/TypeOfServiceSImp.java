package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.TypeOfService;
import com.codegym.case_study_2.repositories.TypeOfServiceRepository;
import com.codegym.case_study_2.services.TypeOfServiceS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeOfServiceSImp implements TypeOfServiceS {

    @Autowired
    TypeOfServiceRepository repository;
    @Override
    public Optional<TypeOfService> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(TypeOfService typeOfService) {
        repository.save(typeOfService);
    }

    @Override
    public TypeOfService findByIdL(Long id) {
        return repository.findByIdL(id);
    }

    @Override
    public Page<TypeOfService> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<TypeOfService> findByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<TypeOfService> findAllTypeOfServiceS() {
        return repository.findAll();
    }
}
