package com.bookstore.management.service;

import com.bookstore.management.model.Order;
import com.bookstore.management.model.OrderItem;
import com.bookstore.management.model.User;
import com.bookstore.management.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrdersByUser(User user) {
        return orderRepository.findByUser(user);
    }

    public Order placeOrder(User user, List<OrderItem> orderItems, double totalAmount) {
        Order order = new Order(user, orderItems, new Date(), totalAmount, null);
        return orderRepository.save(order);
    }
}

