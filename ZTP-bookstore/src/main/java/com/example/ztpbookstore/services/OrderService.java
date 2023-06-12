package com.example.ztpbookstore.services;

import com.example.ztpbookstore.models.Order;
import com.example.ztpbookstore.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderService {
    @Autowired
    private CartService cartService;

    @Autowired
    private OrderRepository orderRepository;

    public Mono<String> placeOrder() {
        return cartService.getCartItems()
                .collectList()
                .flatMap(cartItems -> {
                    if (cartItems.isEmpty()) {
                        return Mono.just("Cart is empty. Cannot place an order.");
                    } else {
                        Order order = new Order();
                        order.setBooks(cartItems);
                        order.setOrderDate("2023-06-13"); // Actual date
                        return orderRepository.save(order)
                                .flatMap(savedOrder -> {
                                    cartService.clearCart();
                                    return Mono.just("Order placed successfully. Order ID: " + savedOrder.getId());
                                });
                    }
                });
    }

    public Flux<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Mono<Order> getOrderById(String orderId) {
        return orderRepository.findById(orderId);
    }
}
