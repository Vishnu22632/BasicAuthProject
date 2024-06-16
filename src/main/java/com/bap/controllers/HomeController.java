package com.bap.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/user")
	public String get(Authentication authentication) {
		return "Welcome "+authentication.getName()+" To spring security !!!";
	}
	

}
