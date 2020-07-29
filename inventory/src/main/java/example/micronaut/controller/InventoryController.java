package example.micronaut.controller;

import example.micronaut.model.Book;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/api")
public class InventoryController {
	
	// for simplicity, omitting services, daos, and db integration.
	
	@Get("/inventory/{isbn}")
	public HttpResponse<?> inventory(String isbn){
		
		if (isbn.equals("0756403146")) {
			
			Book book0 = new Book("0756403146", 35);
			
			return HttpResponse.ok(book0);
		} else if (isbn.equals("0756403162")) {
			
			Book book1 = new Book("0756403162", 14);
			
			return HttpResponse.ok(book1);
		} else if (isbn.equals("0886776643")) {

			Book book2 = new Book("0886776643", 21);
			
			return HttpResponse.ok(book2);
		} else {
			
			
			return HttpResponse.notFound();
		}
	}
}
