package com.te.corejava.assignment;

public class Honda extends Car {
	
	Honda(String brand, String color) {
		super();
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Honda is started");
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda is running");
		
	}

	@Override
	void brake() {
		// TODO Auto-generated method stub
		System.out.println("Honda applied brake");
		
	}
}
