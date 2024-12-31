package com.example.backend_project_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend_project_2.entity.OrderDetail;
import com.example.backend_project_2.entity.Product;
import com.example.backend_project_2.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    
    @Autowired
    private ProductService productService;

    // get all products 
    @GetMapping
    public ResponseEntity<List<Product>> getAllOrderDetails() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }







}
