package com.te.corejava.exception;

public class ProgramThrows {

	public void m1() {
	}

	public void m2(int number) throws Exception {
		if (number == 1) {
			throw new Exception();
		} else
			System.out.println(number);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			new ProgramThrows().m1();
		} catch (Exception e) {
			System.out.println("From Main"); // TODO : Handle Exception
		}
		System.out.println("End");
	}
}
