package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.UserAdmin;
import com.codegym.case_study_2.repositories.UserAdminReponesitory;
import com.codegym.case_study_2.services.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAdminServiceImp implements UserAdminService {

    @Autowired
    UserAdminReponesitory reponesitory;

    @Override
    public Optional<UserAdmin> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        reponesitory.deleteById(id);
    }

    @Override
    public void save(UserAdmin userAdmin) {
        reponesitory.save(userAdmin);
    }

    @Override
    public UserAdmin findByIdL(Long id) {
        return reponesitory.findByIdL(id);
    }

    @Override
    public Page<UserAdmin> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<UserAdmin> findByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<UserAdmin> findAllCustomer() {
        return reponesitory.findAll();
    }
}
