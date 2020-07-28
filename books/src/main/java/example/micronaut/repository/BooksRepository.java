package example.micronaut.repository;

import java.util.List;

import example.micronaut.model.Book;

public interface BooksRepository {

	List<Book> findAll();

}
