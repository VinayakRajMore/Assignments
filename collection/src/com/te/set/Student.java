package com.te.set;

public class Student {

	int rollNo;
	String name;
	String gender;

	public Student(int rollNo, String name, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;

	}

	@Override
	public String toString() {
		return "Student [rollNo = " + rollNo + " , Name : " + name + " , gender : " + gender;

	}

	@Override
	public int hashCode() {
		return rollNo;

	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		if (this.name == student.name)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo (Student o) {
		return this.name.compareTo(gender);
	}
}
