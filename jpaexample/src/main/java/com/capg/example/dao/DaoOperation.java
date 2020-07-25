package com.capg.example.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

//import org.hibernate.Query;

import com.capg.example.model.Student;

//import antlr.collections.List;





public class DaoOperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(100,"ram",LocalDate.of(1999, 8, 17));
		Student s2=new Student(101,"bhem",LocalDate.of(1998, 7, 14));
		Student s3=new Student(102,"raj",LocalDate.of(1995, 5, 14));
		Student s4=new Student();
		
EntityManagerFactory emf=Persistence.createEntityManagerFactory("student-unit");
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.remove(s3);
		tx.commit();
		
		System.out.println(s1);
		System.out.println(s2);
		
		tx.begin();
	    s4=em.find(Student.class,101);
         em.persist(s4);
         tx.commit();
		System.out.println(s4);
		
		String name="ram";	
		Query q=em.createNamedQuery("findByName", Student.class);
		q.setParameter("name","ram");

		List<Student> students=q.getResultList();
		students.forEach(t->System.out.println(t));



	




	}

}
