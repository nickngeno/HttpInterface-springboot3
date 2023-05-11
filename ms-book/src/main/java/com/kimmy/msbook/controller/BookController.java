package com.kimmy.msbook.controller;

import com.kimmy.msbook.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private Environment environment;

    private final Logger logger = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/book/get-port")
    public String getBookData(){
        logger.info("Process={} | Port={}","Getting default port",environment.getProperty("server.port"));
        return "This book service is running in port :"+ environment.getProperty("server.port");
    }
    @GetMapping("/books/all")
    public List<Book> allBooks(){
        return List.of(
                new Book(1, "hall of fame", "Kim"),
                new Book(2, "The river between", "Ngugi wa Thiong'o"),
                new Book(3, "Think Big", "Ben Carson"));
    }
    @GetMapping("/books/{id}")
    public Book getBook(){
        return new Book(1, "hall of fame", "Kim");
    }
}
