package com.capg.labbook.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.spring_labbook.Employee;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		  Sbu s=(Sbu)context.getBean("sbudetails",Sbu.class);
		  System.out.println(s);
	
	}
}
