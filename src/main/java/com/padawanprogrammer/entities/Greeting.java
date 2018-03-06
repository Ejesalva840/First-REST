package com.padawanprogrammer.entities;

public class Greeting {
	private static int count;
	private String name;
	
	public Greeting(String name) {
		count++;
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Greeting.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
