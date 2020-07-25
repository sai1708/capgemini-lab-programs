package com.capg.example.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
@NamedQuery(name = "findByName", query = "from Student where student_name=:name")

public class Student {
	
 @Id
 int studentId;
@Column(name = "student_name")
 String studentName;
 LocalDate dob;
public Student(int studentId, String studentName, LocalDate dob) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.dob = dob;
}
public Student() {
	// TODO Auto-generated constructor stub
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + "]";
}
 
 
}
