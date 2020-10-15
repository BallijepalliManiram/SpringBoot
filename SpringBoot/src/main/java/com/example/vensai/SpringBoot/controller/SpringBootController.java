package com.example.vensai.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
