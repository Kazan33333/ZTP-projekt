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
                        ),
                        new BookEntity(
                                null,
                                "To Kill a Mockingbird",
                                "Harper Lee",
                                LocalDate.parse("1960-07-11"),
                                9780061120084L
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
                                9780141439518L
                        ),
                        new BookEntity(
                                null,
                                "The Great Gatsby",
                                "F. Scott Fitzgerald",
                                LocalDate.parse("1925-04-10"),
                                9780743273565L
                        ),
                        new BookEntity(
                                null,
                                "Hercule Poirot",
                                "Agatha Christie",
                                LocalDate.parse("1997-04-12"),
                                9780307474211L
                        ),
                        new BookEntity(
                                null,
                                "Moby-Dick",
                                "Herman Melville",
                                LocalDate.parse("1851-10-18"),
                                9780142437247L
                        ),
                        new BookEntity(
                                null,
                                "The Adventures of Huckleberry Finn",
                                "Mark Twain",
                                LocalDate.parse("1884-12-10"),
                                9780486280615L
                        ),
                        new BookEntity(
                                null,
                                "The Divine Comedy",
                                "Dante Alighieri",
                                LocalDate.parse("1320-09-14"),
                                9780141195872L
                        ),
                        new BookEntity(
                                null,
                                "Brave New World",
                                "Aldous Huxley",
                                LocalDate.parse("1932-06-01"),
                                9780060850524L
                        ),
                        new BookEntity(
                                null,
                                "Jane Eyre",
                                "Charlotte Brontë",
                                LocalDate.parse("1847-10-16"),
                                9780141441146L
                        ),
                        new BookEntity(
                                null,
                                "War and Peace",
                                "Leo Tolstoy",
                                LocalDate.parse("1869-01-01"),
                                9780140447934L
                        ),
                        new BookEntity(
                                null,
                                "One Hundred Years of Solitude",
                                "Gabriel García Márquez",
                                LocalDate.parse("1967-05-30"),
                                9780060883287L
                        ),
                        new BookEntity(
                                null,
                                "Crime and Punishment",
                                "Fyodor Dostoevsky",
                                LocalDate.parse("1866-01-01"),
                                9780486415871L
                        ),
                        new BookEntity(
                                null,
                                "The Brothers Karamazov",
                                "Fyodor Dostoevsky",
                                LocalDate.parse("1880-11-26"),
                                9780374528379L
                        ),
                        new BookEntity(
                                null,
                                "Wuthering Heights",
                                "Emily Brontë",
                                LocalDate.parse("1847-12-20"),
                                9780141439556L
                        ),
                        new BookEntity(
                                null,
                                "The Picture of Dorian Gray",
                                "Oscar Wilde",
                                LocalDate.parse("1890-07-01"),
                                9780141439570L
                        ),
                        new BookEntity(
                                null,
                                "The Count of Monte Cristo",
                                "Alexandre Dumas",
                                LocalDate.parse("1844-08-28"),
                                9780140449266L
                        ),
                        new BookEntity(
                                null,
                                "Frankenstein",
                                "Mary Shelley",
                                LocalDate.parse("1818-01-01"),
                                9780141439471L
                        ),
                        new BookEntity(
                                null,
                                "The Scarlet Letter",
                                "Nathaniel Hawthorne",
                                LocalDate.parse("1850-03-16"),
                                9780142437261L
                        ),
                        new BookEntity(
                                null,
                                "The Adventures of Tom Sawyer",
                                "Mark Twain",
                                LocalDate.parse("1876-12-01"),
                                9780486400778L
                        ),
                        new BookEntity(
                                null,
                                "Les Misérables",
                                "Victor Hugo",
                                LocalDate.parse("1862-04-03"),
                                9780140449082L
                        ),
                        new BookEntity(
                                null,
                                "Anna Karenina",
                                "Leo Tolstoy",
                                LocalDate.parse("1877-01-01"),
                                9780143035008L
                        ),
                        new BookEntity(
                                null,
                                "Don Quixote",
                                "Miguel de Cervantes",
                                LocalDate.parse("1605-01-16"),
                                9780060934347L
                        ),
                        new BookEntity(
                                null,
                                "The Grapes of Wrath",
                                "John Steinbeck",
                                LocalDate.parse("1939-04-14"),
                                9780143039433L
                        ),
                        new BookEntity(
                                null,
                                "The Old Man and the Sea",
                                "Ernest Hemingway",
                                LocalDate.parse("1952-09-01"),
                                9780684801223L
                        ),
                        new BookEntity(
                                null,
                                "The Canterbury Tales",
                                "Geoffrey Chaucer",
                                LocalDate.parse("1478-01-01"),
                                9780140424386L
                        ),
                        new BookEntity(
                                null,
                                "The Sun Also Rises",
                                "Ernest Hemingway",
                                LocalDate.parse("1926-10-22"),
                                9780743297332L
                        ),
                        new BookEntity(
                                null,
                                "The Sound and the Fury",
                                "William Faulkner",
                                LocalDate.parse("1929-10-07"),
                                9780679732242L
                        )

                )
                .flatMap(e -> bookEntityRepository.save(e))
                .subscribe();
    }
}
