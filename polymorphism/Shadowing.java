package com.te.corejava.polymorphism;

public class Shadowing {
	public static void main(String[] args) {

		SmartPhone smartPhone = new SmartPhone("Apple",14000,"White",12,3);
		smartPhone.simcard();
		Phone phone =new Phone();
		phone.simcard();
		Phone smartPhone2 = new SmartPhone ();
		smartPhone2.simcard();
		
	}

}
