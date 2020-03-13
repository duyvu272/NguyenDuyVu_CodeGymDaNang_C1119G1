package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.TypeOfCustomer;
import com.codegym.case_study_2.repositories.TypeOfCustomerRepository;
import com.codegym.case_study_2.services.TypeOfCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeOfCustomerServiceImp implements TypeOfCustomerService {

    @Autowired
    TypeOfCustomerRepository repository;

    @Override
    public Optional<TypeOfCustomer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(TypeOfCustomer typeOfCustomer) {

    }

    @Override
    public TypeOfCustomer findByIdL(Long id) {
        return null;
    }

    @Override
    public Page<TypeOfCustomer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<TypeOfCustomer> findByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<TypeOfCustomer> findAllC() {
        return repository.findAll();
    }
}
