package com.example.demo.repository;


import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long> {
@Query("select c from Blog c WHERE c.id =?1")
    Blog findByIdL(Long id);
    Page<Blog> findAll(Pageable pageable);

    @Query("select c from Blog c where c.author like  ?1%")
    Page<Blog> findByName(String name,Pageable pageable);

    @Query("select  b from Blog b where b.category.id = ?1")
    Page<Blog> findBlogByCategories(Long id,Pageable pageable);




}
