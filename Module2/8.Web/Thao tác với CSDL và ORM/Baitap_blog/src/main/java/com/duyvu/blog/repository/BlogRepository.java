package com.duyvu.blog.repository;

import com.duyvu.blog.model.Blog;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface BlogRepository extends Repository<Blog, Long> {
}
