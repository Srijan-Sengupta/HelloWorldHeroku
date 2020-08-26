package com.srijan.spring.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "<BUTTON>Hello World from Spring boot.</BUTTON>";
	}

	@RequestMapping("/hello")
	public String hello(){
		return "<H1>Hello World from Spring boot.</H1><BR> Created by Srijan Sengupta";
	}
}
