package com.codegym.case_study_2.services;

import com.codegym.case_study_2.models.Customer;
import com.codegym.case_study_2.models.UserAdmin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserAdminService {
    Optional<UserAdmin> findById(Long id);
    void delete(Long id);
    void save(UserAdmin userAdmin);
    UserAdmin findByIdL(Long id);
    Page<UserAdmin> findAll(Pageable pageable);
    Page<UserAdmin> findByName(String name, Pageable pageable);
    List<UserAdmin> findAllCustomer();

}
