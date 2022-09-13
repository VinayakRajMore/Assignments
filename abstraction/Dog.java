package com.te.corejava.abstraction;

public abstract class Dog {
	
	String name;
	String ownerName;
	
	public Dog(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public abstract void bark();
	
	public abstract void eat();
	
	public void poop() {
		System.out.println("Dog is pooping");
	}	

}
