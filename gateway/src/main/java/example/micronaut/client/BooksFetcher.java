package example.micronaut.client;

import example.micronaut.model.Book;
import io.reactivex.Flowable;

public interface BooksFetcher {
	
	Flowable<Book> fetchBooks();
}
