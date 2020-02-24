package com.codegym.services;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void save(Product product);
    void delete(int id);
    Product findById(int id);
    void update(int id,Product product);
}
