package com.capg.labbook.example2;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emplyoee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	

}
