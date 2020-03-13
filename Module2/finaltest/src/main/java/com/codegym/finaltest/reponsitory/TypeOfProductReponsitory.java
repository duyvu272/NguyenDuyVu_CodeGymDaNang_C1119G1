package com.codegym.finaltest.reponsitory;

import com.codegym.finaltest.model.Product;
import com.codegym.finaltest.model.TypeOfProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TypeOfProductReponsitory extends JpaRepository<TypeOfProduct,Long> {
    @Query("select c from TypeOfProduct c WHERE c.idType =?1")
    TypeOfProduct findByIdL(Long id);

    Page<TypeOfProduct> findAll(Pageable pageable);

    @Query("select c from TypeOfProduct c where c.nameType like  ?1%")
    Page<TypeOfProduct> findByName(String name, Pageable pageable);
}
