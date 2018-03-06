package com.padawanprogrammer.controllers;

import com.padawanprogrammer.entities.Greeting;

public class GreetingController {
	
	public Greeting getGreeting(String name) {
		return new Greeting(name);
	}
}
