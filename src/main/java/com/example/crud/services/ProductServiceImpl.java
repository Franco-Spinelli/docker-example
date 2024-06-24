package com.example.crud.services;

import com.example.crud.entities.Product;
import com.example.crud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
    @Transactional
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    @Transactional
    @Override
    public void remove(Product product) {
        productRepository.delete(product);
    }
}
