package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(11, "Vinayak", 35000));
		arrayList.add(new Employee(12, "Mohit", 38000));
		arrayList.add(new Employee(13, "Bhagawat", 37000));
		arrayList.add(new Employee(14, "Darshan", 36000));
		
		System.out.println("==========================================");
		
		Scanner scanner = new Scanner(System.in);
		SortingByName sortingByName = new SortingByName();
		SortingBySalary sortingBySalary = new SortingBySalary();
		String next = scanner.next();
		
		if (next.equalsIgnoreCase("name")) {
			Collections.sort(arrayList, sortingByName);
		}
		
		if (next.equalsIgnoreCase("salary")) {
			Collections.sort(arrayList, sortingBySalary);
		}
		
		for (Employee employee : arrayList) {
			System.out.println(employee);
		
		

//		System.out.println("=========== Using FOR Loop ===========");
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
//
//		System.out.println("=========== Using Advance FOR Loop ===========");
//
//		for (Object obj : arrayList) {
//			System.out.println(obj);
//
//		}
//
//		System.out.println("=========== Using Iterator ===========");
//		Iterator<Object> iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
		}

	}

}
