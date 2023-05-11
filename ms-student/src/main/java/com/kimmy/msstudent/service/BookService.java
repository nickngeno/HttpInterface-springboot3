package com.kimmy.msstudent.service;

import org.springframework.web.service.annotation.GetExchange;

public interface BookService {
    @GetExchange("/api/book/get-port")
    String getBookPort();
}
