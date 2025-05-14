package com.klu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppController {
	
	@GetMapping("/mul/{a}/{b}")
	public String add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return "Multiplication of two numbers are: " +(a+b);
	}
	
	@GetMapping("/div/{a}/{b}")
	public String sub(@PathVariable("a") int a, @PathVariable("b") int b) {
		return "Division of two numbers are: " +(a-b);
	}

}
