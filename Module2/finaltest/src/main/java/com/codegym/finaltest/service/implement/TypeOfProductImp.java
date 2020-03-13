package com.codegym.finaltest.service.implement;

import com.codegym.finaltest.model.TypeOfProduct;
import com.codegym.finaltest.reponsitory.TypeOfProductReponsitory;
import com.codegym.finaltest.service.TypeOfProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeOfProductImp implements TypeOfProductService {

    @Autowired
    TypeOfProductReponsitory reponsitory;

    @Override
    public Optional<TypeOfProduct> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        reponsitory.deleteById(id);
    }

    @Override
    public void save(TypeOfProduct type) {
        reponsitory.save(type);
    }

    @Override
    public TypeOfProduct findByIdL(Long id) {
        return reponsitory.findByIdL(id);
    }

    @Override
    public List<TypeOfProduct> findAllTypeProduct() {
        return reponsitory.findAll();
    }
}
