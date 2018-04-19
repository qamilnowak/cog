package service;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.BookR;

import java.io.File;
import java.io.IOException;


public class dzwonDoJSONa {

    ObjectMapper objectMapper = new ObjectMapper();

    BookR book;

    {
        try {
            book = objectMapper.readValue(new File("resources/json/books.json"), BookR.class);

            book.getIsbn();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
