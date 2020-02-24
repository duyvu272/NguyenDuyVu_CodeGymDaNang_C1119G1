package com.duyvu.blog.service.impl;

import com.duyvu.blog.model.Blog;
import com.duyvu.blog.repository.impl.BlogRepositoryImpl;
import com.duyvu.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImplement implements BlogService {
    @Autowired
    BlogRepositoryImpl repository;
    @Override
    public List<Blog> finAllBlog() {
        return repository.finAllBlog();
    }

    @Override
    public Blog findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
    repository.delete(id);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }
}
