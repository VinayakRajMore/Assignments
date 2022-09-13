package com.te.corejava.assignment;

public class Tesla extends Car {

	Tesla() {
		super(null, null);
	}
	
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Tesla is started");
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Tesla is running");
		
	}

	@Override
	void brake() {
		// TODO Auto-generated method stub
		System.out.println("Tesla applied brake");
		
	}

}
