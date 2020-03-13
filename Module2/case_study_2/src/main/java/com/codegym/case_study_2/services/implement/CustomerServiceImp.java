package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.Customer;
import com.codegym.case_study_2.repositories.CustomerReponsitory;
import com.codegym.case_study_2.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    CustomerReponsitory reponsitory;

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        reponsitory.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
          reponsitory.save(customer)  ;
    }

    @Override
    public Customer findByIdL(Long id) {
        return reponsitory.findByIdL(id);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return reponsitory.findAll(pageable);
    }

    @Override
    public Page<Customer> findByName(String name, Pageable pageable) {
        return reponsitory.findByName(name,pageable);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return reponsitory.findAll();
    }
}
