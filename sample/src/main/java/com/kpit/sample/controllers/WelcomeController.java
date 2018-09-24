package com.kpit.sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println("Hello...");
	}
	
	@GetMapping("/api")
	public String m1()
	{
		System.out.println("Controller");
		return "welcome";
	}
	
}
