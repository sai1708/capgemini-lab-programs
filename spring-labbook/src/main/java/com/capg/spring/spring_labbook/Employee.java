package com.capg.spring.spring_labbook;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String bu;
	private int age;
	private SBU bussinessunit;
	
//	public Employee(int id, String name, double salary, String bu, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.bu = bu;
//		this.age = age;
//	}
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
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getBussinessunit() {
		return bussinessunit;
	}
	public void setBussinessunit(SBU bussinessunit) {
		this.bussinessunit = bussinessunit;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bu=" + bu + ", age=" + age
				+ ", bussinessunit=" + bussinessunit + "]";
	}
	
	
	

}
