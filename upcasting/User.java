package com.te.corejava.upcasting;

public class User {

	String name;
	long phoneNumber;
	
	public void text() {
		System.out.println(name +" is typing");
	}
	
	public void call( ) {
		System.out.println(name+" is calling");
	}
}
