package com.capg.exception;

public class ValidateAge  {
	public void validate(int n) throws ValidateException {
		if(n<15) {
			throw new ValidateException("age cannot be less than 15");
		}
		
	}

}
