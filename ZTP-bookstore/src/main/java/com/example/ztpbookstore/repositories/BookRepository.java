package com.example.ztpbookstore.repositories;

import com.example.ztpbookstore.models.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
    Flux<Book> findByAuthor(String author);
    Flux<Book> findByTitle(String title);
    Flux<Book> findByYear(int releaseYear);
}
