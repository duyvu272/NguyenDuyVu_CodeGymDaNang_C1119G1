package com.example.spring_security_angular.services;

import com.example.spring_security_angular.model.User;


import java.util.List;
import java.util.Optional;

public interface UserServices {
    Optional<User> findById(Long id);
    void delete(Long id);
    void save(User user);
    User findByIdL(Long id);
    List<User> findAllUser();

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
