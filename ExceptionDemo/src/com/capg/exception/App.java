package com.capg.exception;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		ValidateAge obj=new ValidateAge();
		try {
			obj.validate(n);
			System.out.println("given age is validated");
		}
		catch(ValidateException e){
			System.err.println("error occured " +e.getMessage());
		}

	}

}
