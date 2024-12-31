package com.example.backend_project_2.repository;


import com.example.backend_project_2.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    // Custom query method to find carts by user ID
    List<Cart> findByUserId(Long userId);

    // Custom query method to find purchased carts
    List<Cart> findByPurchased(boolean purchased);

    // Custom query method to find carts by user ID and purchased status
    List<Cart> findByUserIdAndPurchased(Long userId, boolean purchased);
}

