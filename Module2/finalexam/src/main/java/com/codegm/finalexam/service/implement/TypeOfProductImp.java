package com.codegm.finalexam.service.implement;

import com.codegm.finalexam.model.TypeOfProduct;
import com.codegm.finalexam.reponsitory.TypeOfProductReponsitory;
import com.codegm.finalexam.service.TypeOfProductService;

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
