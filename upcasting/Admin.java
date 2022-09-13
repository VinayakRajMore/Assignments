package com.te.corejava.upcasting;

public class Admin extends User {

	public void addUser (String name) {
		System.out.println(name+" is added");
	}
	
	public void removeUser (String name) {
		System.out.println(name+" is removed");
	}

	
}
