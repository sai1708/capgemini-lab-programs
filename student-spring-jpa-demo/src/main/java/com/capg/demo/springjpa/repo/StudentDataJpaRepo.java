package com.capg.demo.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.demo.springjpa.model.Student;



public interface StudentDataJpaRepo extends JpaRepository<Student, Integer> {
	
	
	@Query("from Student where studentName=:studentName")
	public Student findByStudentName(String studentName);
	public Student findByStudentNameAndStudentId(String studentName,int studentId);

}
