package com.te.corejava.inheritance;

public class Phone {

	String name;
	double price;
	String color;


	public Phone(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		
	}
	
	public void call(String name) {
		System.out.println("Check for the network "+ name);
		System.out.println("Try calling now " + name);
	}
	public void text(String msg) {
		System.out.println("Sending the Message"+msg+"This is the Message");
	}
	
	
}
