package com.te.collection.my;

import java.util.Iterator;

public class Remove {
	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.add(11);
		myArray.add(12);
		myArray.add(13);
		myArray.add(14);
		myArray.add(15);
		myArray.add(16);
		myArray.add(17);
		myArray.add(18);
		myArray.add(19);
		myArray.add(20);
		myArray.add(21);
		myArray.add(22);
		
		System.out.println(myArray.size());
		myArray.remove(15);
		
		Iterator<Object> iterator = myArray.iterator();
		
//		while ( iterator.hasNext()) {
//			System.out.println(iterator.hasNext());
		
		System.out.println(myArray);
		}
		
	}
	
}
