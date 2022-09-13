package com.te.collection.my;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.te.collection.Employee;
import com.te.collection.SortingByName;
import com.te.collection.SortingBySalary;

public class LinkedListNew {

	public static void main(String[] args) {

		LinkedList<Employee> linkedList = new LinkedList<>();
		linkedList.add(new Employee(11, "Vinayak", 35000));
		linkedList.add(new Employee(12, "Mohit", 38000));
		linkedList.add(new Employee(13, "Bhagawat", 37000));
		linkedList.add(new Employee(14, "Darshan", 36000));

		System.out.println("==========================================");

		Scanner scanner = new Scanner(System.in);
		SortingByName sortingByName = new SortingByName();
		SortingBySalary sortingBySalary = new SortingBySalary();
		String next = scanner.next();

		if (next.equalsIgnoreCase("name")) {
			Collections.sort(linkedList, sortingByName);
		}

		if (next.equalsIgnoreCase("salary")) {
			Collections.sort(linkedList, sortingBySalary);
		}

		for (Employee employee : linkedList) {
			System.out.println(employee);
		}

		System.out.println("=========== Using FOR Loop ===========");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

		System.out.println("=========== Using Advance FOR Loop ===========");

		for (Object obj : linkedList) {
			System.out.println(obj);

		}

		System.out.println("=========== Using Iterator ===========");
		Iterator<Employee> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
