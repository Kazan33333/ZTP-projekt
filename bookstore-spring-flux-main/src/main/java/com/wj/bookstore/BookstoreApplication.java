package com.wj.bookstore;

import com.wj.bookstore.book.BookEntity;
import com.wj.bookstore.book.BookEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class BookstoreApplication {

    @Autowired
    private BookEntityRepository bookEntityRepository;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @PostConstruct
    public void init(){
        Flux.just(
                        new BookEntity(
                                null,
                                "The Great Gatsby",
                                "F. Scott Fitzgerald",
                                LocalDate.parse("1925-04-10"),
                                9780743273565L
                        ),
                        new BookEntity(
                                null,
                                "To Kill a Mockingbird",
                                "Harper Lee",
                                LocalDate.parse("1960-07-11"),
                                9780060935467L
                        ),
                        new BookEntity(
                                null,
                                "1984",
                                "George Orwell",
                                LocalDate.parse("1949-06-08"),
                                9780451524935L
                        ),
                        new BookEntity(
                                null,
                                "Pride and Prejudice",
                                "Jane Austen",
                                LocalDate.parse("1813-01-28"),
                                9781503290569L
                        ),
                        new BookEntity(
                                null,
                                "The Catcher in the Rye",
                                "J.D. Salinger",
                                LocalDate.parse("1951-07-16"),
                                9780316769174L
                        ),
                        new BookEntity(
                                null,
                                "The Hobbit",
                                "J.R.R. Tolkien",
                                LocalDate.parse("1937-09-21"),
                                9780547928227L
                        ),
                        new BookEntity(
                                null,
                                "The Chronicles of Narnia",
                                "C.S. Lewis",
                                LocalDate.parse("1950-10-16"),
                                9780066238500L
                        ),
                        new BookEntity(
                                null,
                                "Harry Potter and the Sorcerer's Stone",
                                "J.K. Rowling",
                                LocalDate.parse("1997-06-26"),
                                9780590353427L
                        ),
                        new BookEntity(
                                null,
                                "The Alchemist",
                                "Paulo Coelho",
                                LocalDate.parse("1988-04-25"),
                                9780062315007L
                        ),
                        new BookEntity(
                                null,
                                "The Lord of the Rings",
                                "J.R.R. Tolkien",
                                LocalDate.parse("1954-07-29"),
                                9780544003415L
                        ),
                        new BookEntity(
                                null,
                                "The Da Vinci Code",
                                "Dan Brown",
                                LocalDate.parse("2003-03-18"),
                                9780307474278L
                        )
                )
                .flatMap(e -> bookEntityRepository.save(e))
                .subscribe();
    }
}
