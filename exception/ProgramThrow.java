package com.te.corejava.exception;

public class ProgramThrow {
	
	public void m1() {
		try {
			m2();
		}catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Checked Exception Handled");
		}
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("End Program");
	}
}
