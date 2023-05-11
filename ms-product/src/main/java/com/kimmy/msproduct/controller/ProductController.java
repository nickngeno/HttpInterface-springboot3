package com.kimmy.msproduct.controller;

import com.kimmy.msproduct.model.Product;
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
public class ProductController {

    @Autowired
    private Environment environment;

    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/product/get-port")
    public String getBookData(){
        logger.info("Process={} | Port={}","Getting default port",environment.getProperty("server.port"));
        return "This product service is running in port :"+ environment.getProperty("server.port");
    }
    @GetMapping("/product/all")
    public List<Product> allBooks(){
        return List.of(
                new Product(1, "hall of fame", "Kim"),
                new Product(2, "The river between", "Ngugi wa Thiong'o"),
                new Product(3, "Think Big", "Ben Carson"));
    }
    @GetMapping("/product/{id}")
    public Product getProduct(){
        return new Product(1, "hall of fame", "Kim");
    }
}
