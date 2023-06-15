package com.sample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Cotroller {


	@GetMapping("/welcome")
	public String display() {
		return "Welcome to dockerworld";
	}
}
