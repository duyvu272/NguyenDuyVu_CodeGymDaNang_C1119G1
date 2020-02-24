package com.codegym.services.product_services_implement;

import com.codegym.model.Product;
import com.codegym.reponsitory.ProductReponsitory;
import com.codegym.reponsitory.produc_reponsitory_impl.ProductReponsitoryImplement;
import com.codegym.services.ProductService;

import java.util.List;

public class ProductServicesImlement implements ProductService {
    ProductReponsitory productIml = new ProductReponsitoryImplement();
    @Override
    public List<Product> getAllProducts() {
        return productIml.getAllProducts();
    }

    @Override
    public void save(Product product) {
    productIml.save(product);
    }

    @Override
    public void delete(int id) {
        productIml.delete(id);
    }

    @Override
    public Product findById(int id) {
        return productIml.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productIml.update(id,product);
    }
}
