package com.example.backend_project_2.repository;


import com.example.backend_project_2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Find all products by region
    List<Product> findByRegion(String region);

    // Find all products by a specific price range
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);

    // Find all products by rating greater than or equal to a given value
    List<Product> findByRatingGreaterThanEqual(Integer rating);

    // Find all products with a specific roast level
    List<Product> findByRoastLevel(Integer roastLevel);

    // Search for products by name containing a keyword (case-insensitive)
    List<Product> findByNameContainingIgnoreCase(String keyword);
}

