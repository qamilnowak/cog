package service;

import java.util.Hashtable;

import model.BookR;
import org.springframework.stereotype.Service;


@Service
public class BooksService {
	Hashtable<String, BookR> books = new Hashtable<>();
	public BooksService() {
		BookR b = new BookR();
		java.lang.String names[] = {"Ankit","Bohra","Xyz"};

		b.setAverageRating("1");
		b.setAuthors(names);
		b.setDescription("rap");
		b.setIsbn("123");
		b.setLanguage("pl");
		b.setPageCount(1);
		b.setTitle("rap");
		b.setPreviewLink("onet.pl");
		b.setThumbnailUrl("rap.com");
		b.setSubtitle("a");
		b.setCategories(names);
		b.setPublishedDate("wczoraj");
		b.setPublisher("taco");
		books.put(b.getIsbn(), b);

	}
	public BookR getBooks(String id) {
		if (books.containsKey(id))
			return books.get(id);
		else
			return null;
	}
	public Hashtable<String, BookR> getAll() {
		return books;
	}
}

