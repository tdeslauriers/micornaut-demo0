package example.micronaut.model;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = -2843239835595174927L;
	
	private String isbn;
	private String name;
	private Integer stock;
	
	public Book() {
	}

	public Book(String isbn, Integer stock) {
		this.isbn = isbn;
		this.stock = stock;
	}

	public Book(String isbn, String name) {
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

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
