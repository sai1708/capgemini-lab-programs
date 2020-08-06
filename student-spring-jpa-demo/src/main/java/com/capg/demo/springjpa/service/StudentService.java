package com.capg.demo.springjpa.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.springjpa.errors.InvalidDOBException;
import com.capg.demo.springjpa.errors.StudentAlreadyExistsException;
import com.capg.demo.springjpa.errors.StudentNotFoundException;
import com.capg.demo.springjpa.model.Student;
import com.capg.demo.springjpa.repo.StudentDataJpaRepo;




@Service
public class StudentService {
	
	@Autowired
	StudentDataJpaRepo dataJpaRepo;
	
	
	
	@Transactional
	public Student addStudent(Student student) throws StudentAlreadyExistsException, InvalidDOBException {
		LocalDate pdate=LocalDate.now();
		Period iperiod=Period.between(student.getDob(), pdate);
		if(iperiod.getYears()<18) {
			throw new InvalidDOBException("Age must be greater than 18");
		}
		if(dataJpaRepo.existsById(student.getStudentId())){
			throw new StudentAlreadyExistsException("Student Already Exists");
		}
		return dataJpaRepo.save(student);
	}
	
	
	@Transactional
	public Student getStudent(int studentId) throws StudentNotFoundException {
		
		if(!dataJpaRepo.existsById(studentId)) {
			throw new StudentNotFoundException("Student with id: "+studentId+" Not Found");
		}
		return dataJpaRepo.getOne(studentId);
	}
		

	
	@Transactional
	public List<Student> getAllStudent(){
		
		
		return dataJpaRepo.findAll();
	
	}
	
	@Transactional
	public void deleteStudent(int studentId) throws StudentNotFoundException {
		if(!dataJpaRepo.existsById(studentId)) {
			throw new StudentNotFoundException("Student with id: "+studentId+" Not Found");
		}
		dataJpaRepo.deleteById(studentId);
	}
	
	public Student updateStudent(Student student) throws StudentNotFoundException {
		Student tr=dataJpaRepo.getOne(student.getStudentId());
		if(tr==null) {
			throw new StudentNotFoundException("Trainee with id: "+student.getStudentId()+" Not Found");
		}
		tr.setStudentName(student.getStudentName());
		tr.setDob(student.getDob());
		
		return dataJpaRepo.save(tr);
		
	}



	public Student findStudentByName(String StudentName) throws StudentNotFoundException {
		Student tr= dataJpaRepo.findByStudentName(StudentName);
		if(tr==null) {
			throw new StudentNotFoundException("Student with name: "+StudentName+" Not Found");
		}
		return tr;
	}
	
	public Student findStudentByNameAndStudentId(String studentName, int studentId) throws StudentNotFoundException {
		Student tr= dataJpaRepo.findByStudentNameAndStudentId(studentName, studentId);
		if(tr==null) {
			throw new StudentNotFoundException("Student with name: "+studentName+" and id: "+studentId+" Not Found");
		}
		return tr;
	}
	

}
