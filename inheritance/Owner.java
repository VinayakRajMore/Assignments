package com.te.corejava.inheritance;

public class Owner {
	
	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone("Apple",14000,"White",12,3);
				System.out.println(smartPhone.name);
				System.out.println(smartPhone.color);
				System.out.println(smartPhone.ram + "GB");
				System.out.println(smartPhone.camera);
				System.out.println(smartPhone.price + " INR");
				
				smartPhone.play("BGMI");
				smartPhone.browse();
				smartPhone.call("Rashmika");
				smartPhone.videoCall("Rashi");
	}

}
