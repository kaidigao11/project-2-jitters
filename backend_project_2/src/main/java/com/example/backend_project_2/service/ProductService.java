package com.example.backend_project_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend_project_2.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


}