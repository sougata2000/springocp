package com.example.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOcpApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Java Springboot";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Welcome" + input;

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOcpApplication.class, args);
	}

}
