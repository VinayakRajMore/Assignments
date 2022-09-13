package com.te.thread.surprise.rename;

public class Supplier extends Thread {

	TheBottleShop theBottleshop;
	String name;
	String brand;

	public Supplier(TheBottleShop theBottleShop, String name) {
		super();
		this.theBottleshop = theBottleShop;
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String string) {
		this.brand = brand;
	}

	@Override
	public void run() {
		System.out.println("Supplier");
		theBottleshop.refillStock(brand, 100);
	}

}
