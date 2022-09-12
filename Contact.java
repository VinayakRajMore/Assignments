package com.te.practise;

public class Contact {
	
	String name;
	long phNo;
	
	public Contact(String name, long phNo) {
		super();
		this.name = name;
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "contact [name=" + name + ", phNo=" + phNo + "]";
	}
	public Contact() {
		super();
	}
	

	
	


}
