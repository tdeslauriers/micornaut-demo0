package example.micronaut.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;

import example.micronaut.model.Book;

@Singleton
public class BooksRepositoryImpl implements BooksRepository {

	@Override
	public List<Book> findAll() {
		
		// since this is POC, skipping database implementation
		// these are real isbns for fun though
		Book book0 = new Book("0756403146", "Black Sun Rising");
		Book book1 = new Book("0756403162", "When True Night Falls");
		Book book2 = new Book("0886776643", "Crown of Shadows");
		
		List<Book> booklist = new ArrayList<Book>(
				Arrays.asList(book0, book1, book2));
		
		return booklist;
	}

}
