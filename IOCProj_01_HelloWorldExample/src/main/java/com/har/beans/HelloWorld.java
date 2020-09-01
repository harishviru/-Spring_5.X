package com.har.beans;

public class HelloWorld {

	private String name;
	
	public HelloWorld() {
		System.out.println("HelloWorld.0-param constructor....!");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorld [Welcome to Spring World Mr." + name + "]";
	}

}
