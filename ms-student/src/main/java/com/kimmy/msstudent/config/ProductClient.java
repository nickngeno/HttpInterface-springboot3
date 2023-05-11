package com.kimmy.msstudent.config;

import com.kimmy.msstudent.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Component
public class ProductClient {
    ProductService productService;

    public ProductClient() {
        WebClient webClient = WebClient.builder().baseUrl("http://localhost:8083/").build();
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();
        productService = httpServiceProxyFactory.createClient(ProductService.class);

    }

    public  ProductService getProductService(){
        return  productService;
    }
}
