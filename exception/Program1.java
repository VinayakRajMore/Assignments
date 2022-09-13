package com.te.corejava.exception;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		int b;
		b = scanner.nextInt();
		int res = 0;
		try {
			res = a/b;
			int [] x = {10,11,12,13,14,15,16,17};
			System.out.println(x[res]);
		}
//		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			if (e instanceof ArithmeticException) {
//				System.out.println("Arithmatic Exception");
//			}
//			if (e instanceof ArrayIndexOutOfBoundsException) {
//				System.out.println("AIOOBE");
//			}
//			
//		}
		
		
//		finally {                                             It will execute whether exception is handled or not
//			scanner.close();
//			System.out.println("Connection is closed");
//		}
//		
		
		
		catch (ArithmeticException e) {
			System.out.println("The Denominator entered is not valid");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The number you accessing is not present");
		}
		System.out.println(res);
		scanner.close();
	}

}
