package com.te.java.design_patterns;

public class EmployeeDP{
	
 //@Builder
	
	private int id;
	private String name;
	private double salary;
	private String designation;
	
	public EmployeeDP() {
		
	}
	
	public EmployeeDP(EmployeeDPBuilder employeeDPBuilder) {
		
	}
	
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
