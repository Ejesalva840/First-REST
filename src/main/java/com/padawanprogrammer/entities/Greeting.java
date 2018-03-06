package com.padawanprogrammer.entities;

import java.util.UUID;

public class Greeting {
	private UUID id;
	private String name = "Hello ";
	
	public Greeting(String name) {
		id = UUID.randomUUID();
		this.name += name;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
