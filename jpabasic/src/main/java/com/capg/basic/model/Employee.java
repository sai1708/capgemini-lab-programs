package com.capg.basic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_data")
public class Employee {
  @Id
  int id;
  @Column(name = "employee_name")
  String name;
  //@Column(columnDefinition = "employee_salary")
  double salary;
  //@Column(columnDefinition="employee_department")
  String dept;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Employee(int id, String name, double salary, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}

public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
}
  public Employee() {
	// TODO Auto-generated constructor stub
}
}

