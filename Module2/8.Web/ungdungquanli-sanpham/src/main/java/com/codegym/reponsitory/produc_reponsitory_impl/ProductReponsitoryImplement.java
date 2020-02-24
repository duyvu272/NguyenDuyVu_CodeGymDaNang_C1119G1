package com.codegym.reponsitory.produc_reponsitory_impl;

import com.codegym.Dao.ProductDao;
import com.codegym.model.Product;
import com.codegym.reponsitory.ProductReponsitory;

import java.util.ArrayList;
import java.util.List;

public class ProductReponsitoryImplement implements ProductReponsitory {

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(ProductDao.productMap.values());
    }

    @Override
    public void save(Product product) {
        ProductDao.productMap.put(product.getId(), product);

    }

    @Override
    public void delete(int id) {
        ProductDao.productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        Product product  = ProductDao.productMap.get(id);
        return product ;
    }

    @Override
    public void update(int id, Product product) {
        ProductDao.productMap.put(id,product);
    }
}
