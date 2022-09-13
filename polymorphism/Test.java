package com.te.corejava.polymorphism;

public class Test {
	public static void main(String[] args) {
		Calculator calculator = new Calculator ();
		int add = calculator.add(4, 3);
		int add2= calculator.add(4, 5, 6);
		
		System.out.println(add);
		System.out.println(add2);
		Calculator calculator1 = new ScientificCalculator();
		int add3 = calculator1.add(7,8);
		System.out.println(add3);
	

}

}