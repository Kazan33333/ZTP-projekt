package com.example.restservice.service;

import com.example.restservice.model.Book;
import com.example.restservice.repository.BookRepository;
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

    public Mono<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public Flux<Book> getBooksByYear(int year) {
        return bookRepository.findByYear(year);
    }

    public Mono<String> addToCart(String bookId) {
        // Implementation for adding a book to the cart
        // You can use a separate CartService or include the cart functionality within the BookService
    }

    public Mono<String> removeFromCart(String bookId) {
        // Implementation for removing a book from the cart
    }

    public Flux<Book> getCartItems() {
        // Implementation for retrieving the cart items
    }

    public Mono<String> placeOrder() {
        // Implementation for placing an order with the books from the cart
    }

    public Mono<Order> getOrderById(String orderId) {
        // Implementation for retrieving a specific order
    }

    public Flux<Order> getAllOrders() {
        // Implementation for retrieving all orders
    }
}
