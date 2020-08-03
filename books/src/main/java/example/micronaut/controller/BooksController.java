package example.micronaut.controller;

import java.util.List;

import javax.inject.Inject;

import example.micronaut.model.Book;
import example.micronaut.repository.BooksRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;

@Secured("isAuthenticated()")
@Controller("/api")
public class BooksController {
	
	@Inject
	private final BooksRepository booksRepository;

	public BooksController(BooksRepository booksRepository) {

		this.booksRepository = booksRepository;
	}
	
	@Get("/books")
	public List<Book> list(){
		
		return booksRepository.findAll();
	}
}
