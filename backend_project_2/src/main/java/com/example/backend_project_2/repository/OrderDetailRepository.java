package com.example.backend_project_2.repository;


import com.example.backend_project_2.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

    // Custom query method to find OrderDetails by Cart ID
    List<OrderDetail> findByCartId(Long cartId);

    // Custom query method to find OrderDetails by Product ID
    List<OrderDetail> findByProductId(Long productId);
}

