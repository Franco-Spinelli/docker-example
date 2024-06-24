package com.example.crud.controllers;

import com.example.crud.entities.Product;
import com.example.crud.services.ProductService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("")
    public ResponseEntity<List<Product>>findAll(){
        return ResponseEntity.ok(productService.findAll());
    }
    @GetMapping("/find-by-id")
    public ResponseEntity<Product>view(@RequestBody Long id){
        return ResponseEntity.ok(productService.findById(id).orElseThrow());
    }
    @PostMapping("/create")
    public ResponseEntity<Product>create(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }
    @PutMapping("/update")
    public ResponseEntity<Product>update(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<?>delete(@RequestBody Long id){
        Optional<Product>optionalProduct = productService.findById(id);
        optionalProduct.ifPresent(product -> productService.remove(product));
        return ResponseEntity.ok("Delete");
    }
}
