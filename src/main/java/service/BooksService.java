package service;

import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	Hashtable<String, BookR> books = new Hashtable<>();
	ObjectMapper objectMapper = new ObjectMapper();

	Hashtable<String, Rating> ratings = new Hashtable<>();
	ObjectMapper objectMapper1 = new ObjectMapper();

	public BooksService() throws Exception{

		try {
			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			List<Items> listBook = objectMapper.readValue(new URL("https://gist.githubusercontent.com/qamilnowak/220d87905afcc18547413adce473431c/raw/41ee62c804b8f441389fd0747519a525160a194e/books"),new TypeReference<List<Items>>(){} );

			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			List<Items> listBook1 = objectMapper1.readValue(new URL("https://gist.githubusercontent.com/qamilnowak/220d87905afcc18547413adce473431c/raw/41ee62c804b8f441389fd0747519a525160a194e/books"),new TypeReference<List<Items>>(){} );


			for(int i=0 ; i < listBook.size() ; i++){
				BookR c = new BookR();
				BookR d = new BookR();
				Rating r = new Rating();
				if(listBook1.get(i).getVolumeInfo().getAverageRating() >0.0){
					r.setAverageRating(listBook1.get(i).getVolumeInfo().getAverageRating());
					r.setAuthor(listBook1.get(i).getVolumeInfo().getAuthors());
				}

				c.setAverageRating(listBook.get(i).getVolumeInfo().getAverageRating());
				c.setAuthors(listBook.get(i).getVolumeInfo().getAuthors());
				c.setDescription(listBook.get(i).getVolumeInfo().getDescription());
				c.setLanguage(listBook.get(i).getVolumeInfo().getLanguage());
				c.setPageCount(listBook.get(i).getVolumeInfo().getPageCount());
				c.setTitle(listBook.get(i).getVolumeInfo().getTitle());
				c.setPreviewLink(listBook.get(i).getVolumeInfo().getPreviewLink());
				c.setThumbnailUrl(listBook.get(i).getVolumeInfo().getImageLinks().getThumbnail());
				c.setSubtitle(listBook.get(i).getVolumeInfo().getSubtitle());
				c.setCategories(listBook.get(i).getVolumeInfo().getCategories());
				c.setPublishedDate(listBook.get(i).getVolumeInfo().getPublishedDate());
				c.setPublisher(listBook.get(i).getVolumeInfo().getPublisher());
				d.setAverageRating(listBook.get(i).getVolumeInfo().getAverageRating());
				d.setAuthors(listBook.get(i).getVolumeInfo().getAuthors());
				d.setDescription(listBook.get(i).getVolumeInfo().getDescription());
				d.setLanguage(listBook.get(i).getVolumeInfo().getLanguage());
				d.setPageCount(listBook.get(i).getVolumeInfo().getPageCount());
				d.setTitle(listBook.get(i).getVolumeInfo().getTitle());
				d.setPreviewLink(listBook.get(i).getVolumeInfo().getPreviewLink());
				d.setThumbnailUrl(listBook.get(i).getVolumeInfo().getImageLinks().getThumbnail());
				d.setSubtitle(listBook.get(i).getVolumeInfo().getSubtitle());
				d.setCategories(listBook.get(i).getVolumeInfo().getCategories());
				d.setPublishedDate(listBook.get(i).getVolumeInfo().getPublishedDate());
				d.setPublisher(listBook.get(i).getVolumeInfo().getPublisher());
				List str6 = listBook.get(i).getVolumeInfo().getIndustryIdentifiers();

				try{
				c.setIsbn(str6.get(0).toString());
				d.setIsbn(str6.get(1).toString());
					books.put(c.getIsbn(), c);
					books.put(d.getIsbn(), d);
					ratings.put(r.getAuthor().toString(), r);
				}catch (Exception e){

				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}



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

	public Collection<Rating> getAll1() {
		return ratings.values();
}}

