package com.bookstore.management.controller;

import com.bookstore.management.model.Order;
import com.bookstore.management.model.User;
import com.bookstore.management.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Order>> getOrdersByUser(@PathVariable Long userId) {
        User user = new User(); // Assuming user object retrieval by userId
        user.setId(userId);
        return ResponseEntity.ok(orderService.getOrdersByUser(user));
    }

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.placeOrder(order.getUser(), order.getOrderItems(), order.getTotalAmount()));
    }
}

