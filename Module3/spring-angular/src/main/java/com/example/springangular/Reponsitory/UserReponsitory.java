package com.example.springangular.Reponsitory;

import com.example.springangular.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReponsitory extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
