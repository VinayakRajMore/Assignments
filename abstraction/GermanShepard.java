package com.te.corejava.abstraction;

public class GermanShepard extends Dog {

	public GermanShepard(String name, String ownerName) {
		super(name, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
		System.out.println("Bhu Bhu");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println(super.name+" is eating Pedigree and Milk");
		
	}
	
	@Override
	public void poop() {
		
		System.out.println("Dog is pooping");
	}

}
