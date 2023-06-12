package com.example.ztpbookstore.controllers;

import com.example.ztpbookstore.models.Book;
import com.example.ztpbookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/author/{authorName}")
    public Flux<Book> getBooksByAuthor(@PathVariable String authorName) {
        return bookRepository.findByAuthor(authorName);
    }

    @GetMapping("/title/{title}")
    public Flux<Book> getBooksByTitle(@PathVariable String title) {
        return bookRepository.findByTitle(title);
    }

    @GetMapping("/year/{year}")
    public Flux<Book> getBooksByYear(@PathVariable int year) {
        return bookRepository.findByYear(year);
    }
}
