package com.codegym.finaltest.service;

import com.codegym.finaltest.model.Product;
import com.codegym.finaltest.model.TypeOfProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TypeOfProductService {
    Optional<TypeOfProduct> findById(Long id);
    void delete(Long id);
    void save(TypeOfProduct type);
    TypeOfProduct findByIdL(Long id);
    List<TypeOfProduct> findAllTypeProduct();
}
