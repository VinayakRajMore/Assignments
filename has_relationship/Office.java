package com.te.corejava.has_relationship;

public class Office {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name="Vinayak";
		employee.ID=2015;
		employee.contactNumber=9518712736l;
		
		Address address = new Address();
		address.buildingNumber="34/D";
		address.landmark="Chh. Shivaji Maharaj Chowk";
		address.pincode=416212;
		
		employee.address=address;
		
		System.out.println(employee.name);
		System.out.println(employee.ID);
		System.out.println(employee.contactNumber);
		System.out.println(employee.address.buildingNumber);
		System.out.println(employee.address.landmark);
		System.out.println(employee.address.pincode);
		
	}

}
