package com.test.java8;

public class Person {
	
	private String name;
	
	public Person() {
		
		
	}
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void say(String s) {
		System.out.println(" pessoa fala coisas sobre " + s);
	}
}
