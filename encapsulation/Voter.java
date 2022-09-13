package com.te.corejava.encapsulation;

public class Voter {
	
	private int age;
	private String name;
	private int id;
	
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age > 18) {
			this.age = age;
			System.out.println(this.name+ " is not eligible to vote");
		}
		else {
			System.out.println(this.name+" is eligible to vote");
		}
	}
	
	public String getName() {
		return name;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
