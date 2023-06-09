import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CartService {
    @Autowired
    private BookRepository bookRepository;

    private Flux<Book> cartItems = Flux.empty();

    public Mono<String> addToCart(String bookId) {
        return bookRepository.findById(bookId)
                .flatMap(book -> {
                    cartItems = cartItems.concatWith(Mono.just(book));
                    return Mono.just("Book added to cart successfully.");
                })
                .defaultIfEmpty("Book not found.");
    }

    public Mono<String> removeFromCart(String bookId) {
        cartItems = cartItems.filter(book -> !book.getId().equals(bookId));
        return Mono.just("Book removed from cart successfully.");
    }

    public Flux<Book> getCartItems() {
        return cartItems;
    }
}
