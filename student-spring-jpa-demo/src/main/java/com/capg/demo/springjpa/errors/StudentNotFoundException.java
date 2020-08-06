package com.capg.demo.springjpa.errors;

public class StudentNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6270971342792467425L;
	
	
	public StudentNotFoundException(String message) {
		super(message);
	}


}
