package com.te.thread.surprise.rename;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		TheBottleShop theBottleShop = new TheBottleShop();
		Customer bhagu = new Customer(theBottleShop,"Bhagawat","Signature");
		Customer mohit = new Customer(theBottleShop,"Mohit","Oak Smith Gold");
		Customer vinayak = new Customer(theBottleShop,"Vinayak","Ballantine's");
		
		bhagu.start();
		mohit.start();
		vinayak.start();
		
		Supplier darshan = new Supplier(theBottleShop,"Darshan");
		darshan.setBrand("Ballentine's");
		Thread.sleep(1000);
		darshan.start();
		
	}
	
	

}
