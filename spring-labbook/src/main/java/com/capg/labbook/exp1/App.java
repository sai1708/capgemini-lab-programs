package com.capg.labbook.exp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		  Employee m=context.getBean("emps",Employee.class);
		  System.out.println(m);


	}

}
