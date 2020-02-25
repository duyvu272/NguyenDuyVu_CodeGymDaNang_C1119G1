package com.example.demo.repositories;


import com.example.demo.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceReponsitory extends JpaRepository<Service,Long> {
}
