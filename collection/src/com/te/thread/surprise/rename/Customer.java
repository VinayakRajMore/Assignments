package com.te.thread.surprise.rename;

public class Customer extends Thread {

	TheBottleShop theBottleshop;
	String name;
	String brand;
	
	public Customer (TheBottleShop theBottleShop, String name, String brand) {
		super();
		this.theBottleshop = theBottleShop;
		this.name = name;
		this.brand = brand;
		
	}
	

	
	@Override
	public void run() {
		System.out.println("Supplier");
		theBottleshop.refillStock(brand, 100);
	}

}
