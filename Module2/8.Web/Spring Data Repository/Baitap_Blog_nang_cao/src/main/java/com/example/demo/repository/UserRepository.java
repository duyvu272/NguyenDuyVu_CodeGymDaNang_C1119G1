package com.example.demo.repository;

import com.example.demo.model.Blog;
import com.example.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select c from User c WHERE c.id =?1")
    User findByIdL(Long id);
    Page<User> findAll(Pageable pageable);

    @Query("select c from User c where c.name like  ?1%")
    Page<User> findByName(String name,Pageable pageable);


}
