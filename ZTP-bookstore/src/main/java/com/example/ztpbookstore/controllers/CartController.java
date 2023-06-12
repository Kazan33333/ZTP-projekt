package com.example.ztpbookstore.controllers;

import com.example.ztpbookstore.models.Book;
import com.example.ztpbookstore.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add/{bookId}")
    public Mono<String> addToCart(@PathVariable String bookId) {
        return cartService.addToCart(bookId);
    }

    @DeleteMapping("/remove/{bookId}")
    public Mono<String> removeFromCart(@PathVariable String bookId) {
        return cartService.removeFromCart(bookId);
    }

    @GetMapping
    public Flux<Book> getCartItems() {
        return cartService.getCartItems();
    }
}
