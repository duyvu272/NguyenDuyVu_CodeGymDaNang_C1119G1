package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class UserServiceImplement implements UserSevice {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
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
    public Blog findByIdL(Long id) {
        return findByIdL(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Page<User> findByName(String name, Pageable pageable) {
        return userRepository.findByName(name,pageable);
    }
}
