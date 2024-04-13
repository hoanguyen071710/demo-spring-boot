package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @GetMapping
	// public String hello() {
	// 	return "Hello World!";
	// }

	@GetMapping
	public List<String> helloList() {
		return List.of("Hello", "World", "1", "2", "3");
	}

}
