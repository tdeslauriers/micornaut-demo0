package example.micronaut.model;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = -2843239835595174927L;
	
	// international book numbers
	private String isbn;
	private String name;
	
	public Book() {
		super();
	}

	public Book(String isbn, String name) {
		super();
		this.isbn = isbn;
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
