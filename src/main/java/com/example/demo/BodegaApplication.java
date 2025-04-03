package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BodegaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodegaApplication.class, args);
		registry.addMapping("/")
						.allowedOrigins("http://127.0.0.1:5500","http://localhost:8080","http://localhost:8100")
						.allowedMethods("*")
						.allowedHeaders("*")
						.allowCredentials(true);
	}

}
