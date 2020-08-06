package com.capg.demo.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.springjpa.errors.InvalidDOBException;
import com.capg.demo.springjpa.errors.StudentAlreadyExistsException;
import com.capg.demo.springjpa.errors.StudentNotFoundException;
import com.capg.demo.springjpa.model.Student;
import com.capg.demo.springjpa.service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@PostMapping("/students")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Student addStudent(@RequestBody Student student) throws StudentAlreadyExistsException, InvalidDOBException{
		return service.addStudent(student);
	}
	
	@GetMapping("/students/id/{id}")
	public Student getStudent(@PathVariable int id) throws StudentNotFoundException {
		return service.getStudent(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
	}
	
	@DeleteMapping("/students/id/{id}")
	public void deleteStudent(@PathVariable int id) throws StudentNotFoundException {
		service.deleteStudent(id);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) throws StudentNotFoundException {
		return service.updateStudent(student);
		
	}
	
	@GetMapping("/students/name/{studentName}")
	public Student getStudentByName(@PathVariable String studentName) throws StudentNotFoundException {
		return service.findStudentByName(studentName);
	}
	
	@GetMapping("/students/name/{studentName}/id/{studentId}")
	public Student getTraineeByName(@PathVariable String studentName, @PathVariable int studentId) throws StudentNotFoundException {
		return service.findStudentByNameAndStudentId(studentName, studentId);
	}
}
