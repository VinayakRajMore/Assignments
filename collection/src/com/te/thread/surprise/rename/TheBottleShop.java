package com.te.thread.surprise.rename;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TheBottleShop {

	List<String> brand = Arrays.asList("Old Monk", "Oak Smith Gold","100 Pipers", "Signature", "Teachers", "Ballantine's");
	int quantity;

	public synchronized void buy(String name, int numberOfBottles) {
		Boolean b = brand.stream().anyMatch(x -> x.equals((String) name));
		if (b) {
			System.out.println("Here is your brand " + name);
			System.out.println("Here are your bottles, Don't Drink & Drive");
			quantity -= numberOfBottles;
		} else {
			System.out.println("Wait, stock is being refilled");
			try {
				this.wait();
				System.out.println("Thanks for waiting... Here's your drink");
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}

	}
	
	public synchronized void refillStock (String name, int quantity) {
		HashSet<String> hashSet = new HashSet<>(brand);
		hashSet.add(name);
		ArrayList<String> arrayList = new ArrayList<>(hashSet);
		brand=arrayList;
		this.quantity += quantity;
		this.notify();
	}

}
