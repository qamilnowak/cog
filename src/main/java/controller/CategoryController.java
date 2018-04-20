package controller;

import model.BookR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BooksService;

import java.util.Hashtable;
import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class CategoryController {

	@Autowired
	BooksService bs;

	@RequestMapping("/all")
	public Hashtable<String, BookR> getAll() {
		return bs.getAll();
	}



	@RequestMapping("{categories}")
	public BookR getCat(@PathVariable("categories") List list) {
		return bs.getCat(list);
	}
}

