package com.te.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set<Student> hashSet = new HashSet<>();
		Student student2 = new Student(1,"Rushi","Male");
		Student student3 = new Student(1,"Rushi","Male");
		
		hashSet.add(student2);
		hashSet.add(new Student (2,"Darshana","Female"));
		hashSet.add(new Student (3,"Bhawani","Male"));
		hashSet.add(student3);
		hashSet.add(student2);
		System.out.println(student2.hashCode()+"::"+student3.hashCode());
		Iterator<Student> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
			
		}
	}
}

