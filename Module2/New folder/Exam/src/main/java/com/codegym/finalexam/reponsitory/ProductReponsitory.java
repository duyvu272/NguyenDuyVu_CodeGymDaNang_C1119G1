package com.codegym.finalexam.reponsitory;

import com.codegym.finalexam.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductReponsitory extends JpaRepository<Product,Long> {
    @Query("select c from Product c WHERE c.id =?1")
    Product findByIdL(Long id);

    Page<Product> findAll(Pageable pageable);

    @Query("select c from Product c where c.name like  ?1%")
    Page<Product> findByName(String name, Pageable pageable);

}
