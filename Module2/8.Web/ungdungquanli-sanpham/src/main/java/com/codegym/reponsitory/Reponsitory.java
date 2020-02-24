package com.codegym.reponsitory;


import java.util.List;

public interface Reponsitory<T> {
    List<T> getAllProducts();
    void save(T t);
    void delete(int id);
    T findById(int id);
    void update(int id,T t);
}
