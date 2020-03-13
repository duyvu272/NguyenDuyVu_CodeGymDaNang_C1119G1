package com.codegym.finalexam.service;

import com.codegym.finalexam.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    void delete(Long id);
    void save(Product product);
    Product findByIdL(Long id);
    Page<Product> findAll(Pageable pageable);
    Page<Product> findByName(String name, Pageable pageable);
    List<Product> findAllCustomer();
}
