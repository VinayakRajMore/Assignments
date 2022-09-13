package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("Program Start");
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add("Vinayak");
		arrayList.add(20.0);
		arrayList.add(true);
		arrayList.add(null);
		arrayList.add('a');

		System.out.println("=========== Using FOR Loop ===========");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("=========== Using Advance FOR Loop ===========");

		for (Object obj : arrayList) {
			System.out.println(obj);

		}

		System.out.println("=========== Using Iterator ===========");
		Iterator<Object> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
