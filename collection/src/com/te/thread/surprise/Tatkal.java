package com.te.thread.surprise;

public class Tatkal {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		Irctc irctc = new Irctc();
		User Balya = new User("Balya", 60, irctc);
		User Shalu = new User("Shalu", 20, irctc);
		User Papya = new User("Papya", 25, irctc);
		
		Balya.start();
		Shalu.start();
		Papya.start();
		
	}

}
