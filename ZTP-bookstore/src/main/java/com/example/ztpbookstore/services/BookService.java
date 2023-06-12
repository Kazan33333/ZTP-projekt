package com.example.ztpbookstore.services;

import com.example.ztpbookstore.models.Book;
import com.example.ztpbookstore.models.Order;
import com.example.ztpbookstore.repositories.BookRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Flux<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public Flux<Book> getBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public Flux<Book> getBooksByYear(int year) {
        return bookRepository.findByYear(year);
    }

    public Mono<String> addToCart(String bookId) {
        // Implementation for adding a book to the cart
        // You can use a separate CartService or include the cart functionality within the BookService
        // Replace the return statement with the actual implementation
        return Mono.just("Book added to cart successfully");
    }

    public Mono<String> removeFromCart(String bookId) {
        // Implementation for removing a book from the cart
        // Replace the return statement with the actual implementation
        return Mono.just("Book removed from cart successfully");
    }

    public Flux<Book> getCartItems() {
        // Implementation for retrieving the cart items
        // Replace the return statement with the actual implementation
        return Flux.empty();
    }

    public Mono<String> placeOrder() {
        // Implementation for placing an order with the books from the cart
        // Replace the return statement with the actual implementation
        return Mono.just("Order placed successfully");
    }

    public Mono<Order> getOrderById(String orderId) {
        // Implementation for retrieving a specific order
        // Replace the return statement with the actual implementation
        return Mono.empty();
    }

    public Flux<Order> getAllOrders() {
        // Implementation for retrieving all orders
        // Replace the return statement with the actual implementation
        return Flux.empty();
    }
}
