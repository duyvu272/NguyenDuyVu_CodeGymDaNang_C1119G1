package com.codegm.finalexam.service.implement;

import com.codegm.finalexam.model.Product;
import com.codegm.finalexam.reponsitory.ProductReponsitory;
import com.codegm.finalexam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductReponsitory reponsitory;

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        reponsitory.deleteById(id);
    }

    @Override
    public void save(Product product) {
    reponsitory.save(product);
    }

    @Override
    public Product findByIdL(Long id) {
        return reponsitory.findByIdL(id);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return reponsitory.findAll(pageable);
    }

    @Override
    public Page<Product> findByName(String name, Pageable pageable) {
        return reponsitory.findByName(name,pageable);
    }

    @Override
    public List<Product> findAllProduct() {
        return reponsitory.findAll();
    }
}
