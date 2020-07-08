package com.example.spring_security_angular.repository;

import com.example.spring_security_angular.model.ERole;
import com.example.spring_security_angular.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
