package com.duyvu.blog.service;

import com.duyvu.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> finAllBlog();
    Blog findById(Long id);
    void delete(Long id);
    void save(Blog t);
}
