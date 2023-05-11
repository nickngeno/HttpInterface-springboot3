package com.kimmy.msbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBookApplication.class, args);
	}

}
