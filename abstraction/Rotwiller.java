package com.te.corejava.abstraction;

public class Rotwiller extends Dog {

	public Rotwiller(String name, String ownerName) {
		super(name, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
		System.out.println("Bhow Bhow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println(super.name+" is eating Pedigree");
		
	}
	
	@Override
	public void poop() {
		
		System.out.println("Dog is pooping");
	}
		

}
