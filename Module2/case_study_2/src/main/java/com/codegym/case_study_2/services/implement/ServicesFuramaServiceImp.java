package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.Service;
import com.codegym.case_study_2.repositories.ServiceReponsitory;
import com.codegym.case_study_2.services.ServicesFuramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServicesFuramaServiceImp implements ServicesFuramaService {
    @Autowired
    ServiceReponsitory reponsitory;

    @Override
    public Optional<Service> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        reponsitory.deleteById(id);
    }

    @Override
    public void save(Service service) {
        reponsitory.save(service);
    }

    @Override
    public Service findByIdL(Long id) {
        return reponsitory.findByIdL(id);
    }

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return reponsitory.findAll(pageable);
    }

    @Override
    public Page<Service> findByName(String name, Pageable pageable) {
        return reponsitory.findByName(name,pageable);
    }

    @Override
    public List<Service> findAllService() {
        return reponsitory.findAll();
    }
}
