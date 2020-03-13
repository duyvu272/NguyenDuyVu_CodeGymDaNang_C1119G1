package com.codegm.finalexam.service;



import com.codegm.finalexam.model.TypeOfProduct;

import java.util.List;
import java.util.Optional;

public interface TypeOfProductService {
    Optional<TypeOfProduct> findById(Long id);
    void delete(Long id);
    void save(TypeOfProduct type);
    TypeOfProduct findByIdL(Long id);
    List<TypeOfProduct> findAllTypeProduct();
}
