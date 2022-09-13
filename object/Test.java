package com.te.corejava.object;

public class Test implements Cloneable{
	
	String name;

	public static void main(String[] args) throws CloneNotSupportedException {
		String s="Vinayak";
		String s1="Vinaya";
		String string=new String("Vinayak");
		String string2=new String("Vinaya");
		
		System.out.println(string.equals(string2));
		System.err.println(s.equals(s1));
		
		Test test = new Test();
		Test t2 = new Test();
		
		System.out.println(test.equals(t2)+"=============");
		
		test.name = "VinayakRaj";
		
		boolean equals = test.equals(t2);
		System.out.println(equals);
		
		test = null;
		System.gc();
	}
	
	
	
	
//	@Override
//	protected void finalize() throws Throwable {
//		System.out.println("Garbage Collected");
//	}
//	

	

		
//		Test test2 = new Test();
//		Test clone = (Test) test.clone();
//		System.out.println(clone.hashCode());
//		System.out.println(test.hashCode());
//		System.out.println(clone.name);
//		System.out.println(test.getClass());
//		System.out.println(test.hashCode());
//		System.out.println(test2.hashCode());
//		
//		test2=null;
//		System.gc();
//		
//	}

}
