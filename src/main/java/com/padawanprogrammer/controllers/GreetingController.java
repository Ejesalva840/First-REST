package com.padawanprogrammer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.padawanprogrammer.entities.Greeting;

@RestController
public class GreetingController {
	
	@GetMapping("/greetings")
	public Greeting getGreeting(@RequestParam(name="name", defaultValue="World") String name) {
		return new Greeting(name);
	}
}
