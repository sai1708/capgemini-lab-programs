package com.capg.exceptions;

import com.capg.exception.ValidateException;

public class EmployeeNameCheck {
	public void NameValidate(String fName, String lName) throws EmployeeNameException{
		if(fName.isEmpty() && lName.isEmpty()) {
		throw new EmployeeNameException("Employee Name is Not Valid");
	}
	}

}
