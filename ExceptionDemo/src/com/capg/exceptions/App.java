package com.capg.exceptions;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName,lName;
		//Scanner in=new Scanner(System.in);
		fName="";
		lName="";
		EmployeeNameCheck obj=new EmployeeNameCheck();
		try {
			obj.NameValidate(fName, lName);
			System.out.println("name is valid");
		}
		catch(EmployeeNameException e){
			System.err.println("error occured " +e.getMessage());
		}

	}

}
