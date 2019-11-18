package com.sheikh.springjwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/authenticate")
	public String authenticate(String username) {
		return "Welcome "+username;
	}
	
	@GetMapping("/authenticate1")
	public String authenticate1(String username) {
		return "Welcome "+username;
	}
}
