package com.te.corejava.exception;

public class ProgramThrows1 {
	public void m1() {
		try {
			m2(1);
		}catch (Exception e) {
		e.printStackTrace();
		}
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
			new ProgramThrows1().m1();
		} catch (Exception e) {
			System.out.println("From Main"); // TODO : Handle Exception
		}
		System.out.println("End");
	}

}
