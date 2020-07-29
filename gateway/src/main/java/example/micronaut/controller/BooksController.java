package example.micronaut.controller;

import javax.inject.Inject;

import example.micronaut.client.BooksFetcher;
import example.micronaut.client.InventoryFetcher;
import example.micronaut.model.Book;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import io.reactivex.Maybe;

@Controller("api")
public class BooksController {
	
	
	private final BooksFetcher booksFetcher;
	
	
	private final InventoryFetcher inventoryFetcher;
	
	public BooksController(BooksFetcher booksFetcher, InventoryFetcher inventoryFetcher) {
		this.booksFetcher = booksFetcher;
		this.inventoryFetcher = inventoryFetcher;
	}
	
	@Get("/books")
	public Flowable<Book> findAll(){
		
		return booksFetcher.fetchBooks();
	}
	
    @Get("/inventory/{isbn}") 
    Maybe<Book> inventory(String isbn){
    	
    	return inventoryFetcher.inventory(isbn);
    }
}
