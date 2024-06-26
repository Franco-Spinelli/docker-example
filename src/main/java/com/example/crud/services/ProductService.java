package com.example.crud.services;

import com.example.crud.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product>findById(Long id);
    Product save(Product product);
    void remove(Product product);
}
