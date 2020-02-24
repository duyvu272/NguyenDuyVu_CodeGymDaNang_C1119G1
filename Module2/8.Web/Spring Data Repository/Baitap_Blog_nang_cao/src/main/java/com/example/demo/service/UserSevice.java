package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserSevice {
    Optional<User> findById(Long id);
    void delete(Long id);
    void save(User t);
    Blog findByIdL(Long id);
    Page<User> findAll(Pageable pageable);
    Page<User> findByName(String name,Pageable pageable);

}
