package com.kimmy.msstudent.config;

import com.kimmy.msstudent.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Component
public class BooksClient {
    private final BookService bookService;

    public BooksClient() {
        WebClient webClient = WebClient.builder().baseUrl("http://localhost:8081/").build();
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();
        bookService = httpServiceProxyFactory.createClient(BookService.class);

    }

    public  BookService getBookService (){
        return  bookService;
    }
}
