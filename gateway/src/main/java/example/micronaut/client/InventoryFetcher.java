package example.micronaut.client;

import example.micronaut.model.Book;
import io.reactivex.Maybe;

public interface InventoryFetcher {

	Maybe<Book> inventory(String isbn);
}
