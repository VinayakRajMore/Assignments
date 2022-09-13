package com.te.design_patterns;

public class Singleton {
	
	static Singleton store = new Singleton();

	private Singleton() {
		
	}
	
	public static Singleton m1( ) {
		
		return store;
	}
	

}
