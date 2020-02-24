package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Optional<Category> findById(Long id);
    void delete(Long id);
    void save(Category t);
    Category findByIdL(Long id);
    Page<Category> findAll(Pageable pageable);
    Page<Category> findByName(String name,Pageable pageable);
    List<Category> findAllC();

}
