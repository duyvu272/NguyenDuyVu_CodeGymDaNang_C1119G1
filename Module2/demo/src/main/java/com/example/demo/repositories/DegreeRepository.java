package com.example.demo.repositories;


import com.example.demo.models.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree,Long> {
}
