package com.te.corejava.array;

public class Test {
	
	public static void main(String[] args) {
		int [] a = {11,12,13,1,2,3}; // declaration with initialization
		int b []; //Declaration
		b = new int [4]; //Initialization
		
		Test[] s;
		s = new Test [3];
		
		Test test = new Test();
		Test test2 = new Test();
		Demo demo = new Demo();
		s[0]=test;
		s[1]=test2;
		Object object = new Object;
		s[2]=object;
		
		
		
		
		String s[];
		s=new String[12];
		
		for (int i=0; i<b.length; i++) {
			b[i] = i+1;
			System.out.println(b[i]);
		}
			
//		System.out.println(a.length);
//		System.out.println(a[0]);
//		System.out.println(b.length);
		
	}

}
