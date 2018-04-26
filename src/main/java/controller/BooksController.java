package controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.stream.Stream;

import model.BookR;

import model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import service.BooksService;

@RestController
@RequestMapping("/api/book")
public class BooksController {

	@Autowired
	BooksService bs;

	@RequestMapping("/all")
	public Hashtable<String, BookR> getAll() {
		return bs.getAll();
	}

	@RequestMapping("/rating")
	public  Collection<Rating> getAll1() {
		return bs.getAll1();
	}



	@RequestMapping("{isbn}")
	public BookR getBooks(@PathVariable("isbn") String id) {
		return bs.getBooks(id);
	}
}

