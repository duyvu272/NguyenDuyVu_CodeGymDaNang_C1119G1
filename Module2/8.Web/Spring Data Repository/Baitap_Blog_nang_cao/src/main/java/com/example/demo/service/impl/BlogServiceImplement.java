package com.example.demo.service.impl;


import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImplement implements BlogService {

    @Autowired
    BlogRepository repository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Blog> findByName(String name,Pageable pageable) {
        return repository.findByName(name,pageable);
    }

    @Override
    public Page<Blog> findBlogByCategories(Long id,Pageable pageable) {
        return repository.findBlogByCategories(id,pageable);
    }


    @Override
    public Optional<Blog> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
    repository.deleteById(id);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public Blog findByIdL(Long id) {
        return repository.findByIdL(id);
    }


}
