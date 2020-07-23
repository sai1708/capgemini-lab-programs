package com.capg.jpa.basic.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.basic.model.Employee;

public class EmployeeDbOperations {
	public static void main(String[] args) {
		
EntityManagerFactory emf=Persistence.createEntityManagerFactory("employee-unit");
		
		EntityManager em=emf.createEntityManager();
		
		 Employee e1=new Employee(101,"nag",20000,"software");
		 
		 EntityTransaction tx=em.getTransaction();
			tx.begin();
			em.persist(e1);
			tx.commit();
			
			em.detach(e1);
			
			tx.begin();
		    //em.persist(e1); //if we write this one we will get errors because of e1 detached
			e1.setSalary(60000); //salary will not be updated on database
			tx.commit();
			
			Employee e2=new Employee(102,"ram",30000);
			tx.begin();
			em.persist(e2);
			e2.setDept("sales");
			tx.commit();
			
			
			
			Employee e3=new Employee(103,"bhem",40000);
			tx.begin();
			em.persist(e3);
			e3.setDept("hardware");
			tx.commit();
			
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
		 
		
	}

}
