package com.cg.eis.exception;

import com.cg.eis.exception.EmployeeException;

public class EmployeeSalary {
	
	public void validate(int salary) throws EmployeeException {
		if(salary<3000) {
			throw new EmployeeException("employee salary cannot be less than 3000");
		}
		
	}

}
