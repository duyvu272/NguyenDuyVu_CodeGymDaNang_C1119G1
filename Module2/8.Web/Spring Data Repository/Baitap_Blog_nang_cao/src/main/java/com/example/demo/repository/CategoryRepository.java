package com.example.demo.repository;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Query("select c from Category c WHERE c.id =?1")
    Category findByIdL(Long id);


    @Query("select  b from Blog b where b.category.id = ?1")
    List<Blog> findBlogByCategories(Long id);



    Page<Category> findAll(Pageable pageable);

    @Query("select c from Category c where c.nameCategory like  ?1%")
    Page<Blog> findByName(String name,Pageable pageable);

}
