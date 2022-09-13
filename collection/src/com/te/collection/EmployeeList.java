package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeList {
	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(11, "Vinayak", 35000.00));
		arrayList.add(new Employee(12, "Mohit", 38000.05));
		arrayList.add(new Employee(13, "Bhagawat", 37000.50));
		arrayList.add(new Employee(14, "darshan", 36000));
		
		System.out.println("===================================");
		
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		
		if (next.equalsIgnoreCase("name")) {
			System.out.println("Sorting By Name");
			Collections.sort(arrayList, new SortingByName());
		}
		System.out.println("===================================");
		
		if (next.equalsIgnoreCase("salary")) {
			System.out.println("Sorting By Salary");
			Collections.sort(arrayList, new SortingBySalary());
			
		}
		
		System.out.println("===================================");
		
		
//		if (next.equalsIgnoreCase("id")) {
//			System.out.println("Sorting By id");
//			Collections.sort(arrayList);
//			
//		
//		Collections.sort(arrayList);
//
//		for (Employee employee : arrayList) {
//			System.out.println(employee);
//
//		}
	}

}
