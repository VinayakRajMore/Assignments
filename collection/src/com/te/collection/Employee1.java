package com.te.collection;

public class Employee1 {
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		
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
	
	@Override
	public String toString() {
		return "Employee [id =" + id +", name =" + name + ", salary ="+ salary+ "]";
	}
	
	//emp.comapr(amp1)
	public  int compareTo(Employee o) {
		return (this.id-o.id);
	}
	
	
	
		
	

}
