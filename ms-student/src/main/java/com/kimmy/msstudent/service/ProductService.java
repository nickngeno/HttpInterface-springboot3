package com.kimmy.msstudent.service;

import org.springframework.web.service.annotation.GetExchange;

public interface ProductService {
    @GetExchange("/api/product/get-port")
    String getProductPort();
}
