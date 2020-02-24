package com.example.demo.service;


import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface BlogService {
    Optional<Blog> findById(Long id);
    void delete(Long id);
    void save(Blog t);
    Blog findByIdL(Long id);
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findByName(String name,Pageable pageable);
    Page<Blog> findBlogByCategories(Long id,Pageable pageable);
}
