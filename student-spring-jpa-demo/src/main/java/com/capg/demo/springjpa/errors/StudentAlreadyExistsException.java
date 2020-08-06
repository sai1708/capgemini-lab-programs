package com.capg.demo.springjpa.errors;

public class StudentAlreadyExistsException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6270971342792467425L;
	
	
	public StudentAlreadyExistsException(String message) {
		super(message);
	}


}
