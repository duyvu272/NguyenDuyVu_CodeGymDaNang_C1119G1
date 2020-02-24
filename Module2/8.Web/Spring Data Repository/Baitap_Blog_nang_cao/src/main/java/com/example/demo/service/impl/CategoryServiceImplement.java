package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplement implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void save(Category t) {
        categoryRepository.save(t);
    }

    @Override
    public Category findByIdL(Long id) {
        return categoryRepository.findByIdL(id);
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Page<Category> findByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<Category> findAllC() {
        return categoryRepository.findAll();
    }




}
