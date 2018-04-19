package controller;

import java.util.Hashtable;

import model.BookR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.dzwonDoJSONa;


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



	@RequestMapping("{isbn}")
	public BookR getPerson(@PathVariable("isbn") String id) {
		return bs.getBooks(id);
	}
}

