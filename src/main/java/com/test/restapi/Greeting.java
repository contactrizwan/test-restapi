package com.test.restapi;

public class Greeting {

	
	private long id;
	private String message;
	
	public Greeting(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	
	public long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	

	
}
