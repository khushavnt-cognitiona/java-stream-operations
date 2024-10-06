package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	@GetMapping("/get")
	public String getmap() {
		
		
		return "hello Khushvant";
		
	}

}
