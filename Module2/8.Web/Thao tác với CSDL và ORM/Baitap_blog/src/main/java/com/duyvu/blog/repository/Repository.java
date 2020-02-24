package com.duyvu.blog.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repository<T,Id>  {
    List<T> finAllBlog();
    T findById(long id);
    void delete(long id);
    void save(T t);
}
