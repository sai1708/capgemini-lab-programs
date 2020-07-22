package com.cg.eis.exception;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int salary=1000;
      EmployeeSalary obj=new EmployeeSalary();
      try {
    	  obj.validate(salary);
    	  System.out.println("salary is above 3000");
      }
      catch(EmployeeException e) {
    	  System.err.println("error occured " +e.getMessage());
      }
      
	}

}
