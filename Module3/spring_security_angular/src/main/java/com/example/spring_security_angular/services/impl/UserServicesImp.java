package com.example.spring_security_angular.services.impl;

import com.example.spring_security_angular.model.User;
import com.example.spring_security_angular.repository.UserRepository;
import com.example.spring_security_angular.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImp implements UserServices {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
            userRepository.deleteById(id);
    }

    @Override
    public void save(User user) {
            userRepository.save(user);
    }

    @Override
    public User findByIdL(Long id) {
        return userRepository.findByIdL(id);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
