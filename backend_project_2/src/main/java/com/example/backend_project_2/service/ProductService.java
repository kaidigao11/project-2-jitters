package com.example.backend_project_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend_project_2.entity.OrderDetail;
import com.example.backend_project_2.entity.Product;
import com.example.backend_project_2.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    // get all products 
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


}