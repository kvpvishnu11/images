package com.myproj.spring.jpatutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/hello")
	public String HelloWorld() {
		return "Hello boss";
	}

	@GetMapping("/hello2")
	public String HelloWorlssd() {
		return "Hello boss bay 2";
	}

}
