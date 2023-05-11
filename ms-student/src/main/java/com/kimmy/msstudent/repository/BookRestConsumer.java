package com.kimmy.msstudent.repository;

import com.kimmy.msstudent.model.Book;
import com.kimmy.msstudent.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "MS-BOOK")
public interface BookRestConsumer {

    @GetMapping("api/book/data")
    String getBookData();

    @GetMapping("api/books/all")
    List<Book> getAllBooks();

    @GetMapping("api/books/{id}")
    Book getBook(@PathVariable  int id);

    @GetMapping("/posts")
    List<Post> getAllPosts();
}
