package com.te.corejava.abstraction;

public class Owner {
	
	public static void main(String[] args) {
		
		Rotwiller rotwiller = new Rotwiller("Julie","Bhagawat");
		System.out.println(rotwiller.name+" is "+rotwiller.ownerName+"'s dog");
		rotwiller.bark();
		rotwiller.eat();
		rotwiller.poop();
		System.out.println("=======================");
		
		GermanShepard germanShepard = new GermanShepard("Charlie","Darshan");
		System.out.println(germanShepard.name+" is "+germanShepard.ownerName+"'s dog");
		germanShepard.bark();
		germanShepard.eat();
		germanShepard.poop();
		
	}
	

}
