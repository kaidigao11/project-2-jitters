package com.example.backend_project_2.controller;


import com.example.backend_project_2.entity.OrderDetail;
import com.example.backend_project_2.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/order-details")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    // Get all OrderDetails
    @GetMapping
    public ResponseEntity<List<OrderDetail>> getAllOrderDetails() {
        List<OrderDetail> orderDetails = orderDetailService.getAllOrderDetails();
        return ResponseEntity.ok(orderDetails);
    }

    // Get OrderDetail by ID
    @GetMapping("/{id}")
    public ResponseEntity<OrderDetail> getOrderDetailById(@PathVariable Long id) {
        OrderDetail orderDetail = orderDetailService.getOrderDetailById(id);
        return ResponseEntity.ok(orderDetail);
    }

    // Get all OrderDetails by Cart ID
    @GetMapping("/cart/{cartId}")
    public ResponseEntity<List<OrderDetail>> getOrderDetailsByCartId(@PathVariable Long cartId) {
        List<OrderDetail> orderDetails = orderDetailService.getOrderDetailsByCartId(cartId);
        return ResponseEntity.ok(orderDetails);
    }

    // Get all OrderDetails by Product ID
    // @GetMapping("/product/{productId}")
    // public ResponseEntity<List<OrderDetail>> getOrderDetailsByProductId(@PathVariable Long productId) {
    //     List<OrderDetail> orderDetails = orderDetailService.getOrderDetailsByProductId(productId);
    //     return ResponseEntity.ok(orderDetails);
    // }

    // Create a new OrderDetail
    @PostMapping
    public ResponseEntity<OrderDetail> createOrderDetail(
            @RequestParam Long cartId,
            @RequestParam Long productId,
            @RequestParam Integer quantity) {
        OrderDetail orderDetail = orderDetailService.createOrderDetail(cartId, productId, quantity);
        return ResponseEntity.ok(orderDetail);
    }

    // Update an existing OrderDetail
    @PutMapping("/{id}")
    public ResponseEntity<OrderDetail> updateOrderDetail(
            @PathVariable Long id,
            @RequestParam Long productId,
            @RequestParam Integer quantity) {
        OrderDetail updatedOrderDetail = orderDetailService.updateOrderDetail(id, productId, quantity);
        return ResponseEntity.ok(updatedOrderDetail);
    }

    // Delete an OrderDetail
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderDetail(@PathVariable Long id) {
        orderDetailService.deleteOrderDetail(id);
        return ResponseEntity.noContent().build();
    }
}

