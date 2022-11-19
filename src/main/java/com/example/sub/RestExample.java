package com.example.sub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExample {
	
	@GetMapping(path = "/")
	public String hello() {
		
		return "<b><h1>Hello World!!!!!!!</h1><b>";
	}

}
