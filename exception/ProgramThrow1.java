package com.te.corejava.exception;

public class ProgramThrow1 {

	public void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public void m2() {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Handled in m2");
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		new ProgramThrow1().m2();
		System.out.println("End");
	}
}
