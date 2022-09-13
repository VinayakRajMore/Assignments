package com.te.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		Set<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student(4, "Vinayak", "Male"));
		treeSet.add(new Student(3, "Mohit", "Male"));
		treeSet.add(new Student(1, "Bhagawat", "Male"));
		
		Iterator<Student> iterator = treeSet.iterator();
		
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
	}
}
