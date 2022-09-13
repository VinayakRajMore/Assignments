package com.te.corejava.inheritance;

public class SmartPhone extends Phone{

	int ram;
	int camera;
	
	
	public SmartPhone(String name, double price, String color, int ram, int camera) {
		super(name,price,color);
		this.ram =ram;
		this.camera=camera;
	}
	
	public void browse() {
		System.out.println("Browsing");
	}
	
	public void videoCall (String name) {
		System.out.println("Video Call "+name);
	}
	public void play(String name) {
		System.out.println("Play "+name);
	}
	
	
}
