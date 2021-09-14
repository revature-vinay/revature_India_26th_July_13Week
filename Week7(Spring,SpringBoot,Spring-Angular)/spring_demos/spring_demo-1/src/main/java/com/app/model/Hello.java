package com.app.model;

public class Hello {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter with setMessage was called with value : "+message);
	}
	
	public Hello() {
	System.out.println("No param constructor called");
	}

	public Hello(String message) {
		super();
		this.message = message;
		System.out.println("1 param constructor called");
	}
	
}
