package com.te.practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public class PhoneBook {

	private Hashtable phoneBook;

	public PhoneBook() {
		this.phoneBook = new Hashtable();
	}

	public void add(String name, String number) {
		if (this.phoneBook.containsKey(name)) {
			System.out.println(name + " exists.");
		} else {
			this.phoneBook.put(name, number);
			System.out.println(name + " was added successfully.");
		}
	}

	public void find(String name) {
		if (this.phoneBook.containsKey(name)) {
			String number = (String) this.phoneBook.get(name);
			System.out.println(name + "'s number is " + number + ".");
		} else {
			System.out.println("No person named '" + name + "' exists.");
		}
	}

	public void status() {
		Enumeration names;
		names = this.phoneBook.keys();
		int total = 0;
		while (names.hasMoreElements()) {
			String str = (String) names.nextElement();
			System.out.println(str + " " + this.phoneBook.get(str));
			total++;
		}
		System.out.println("Total " + total + " persons.");
	}

	public void delete_entry(String name) {
		if (this.phoneBook.containsKey(name)) {
			this.phoneBook.remove(name);
			System.out.println(name + " was deleted successfully.");
		} else {
			System.out.println("No person named '" + name + "' exists.");
		}
	}

	public void saveFile(String fileName) throws IOException {
		FileWriter fw = new FileWriter(fileName);
		Enumeration names = this.phoneBook.keys();
		Enumeration nums = this.phoneBook.elements();
		int total = 0;
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			String num = (String) nums.nextElement();
			fw.write(name + " " + num + "\r\n");
			total++;
		}
		System.out.println("Saved " + total + " persons");
		fw.close();
	}

	public void loadFile(String fileName) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader(fileName));
		String line = read.readLine();
		int total = 0;
		while (line != null) {
			String[] arr = line.split(" ");
			String name = arr[0];
			String num = arr[1];

			this.phoneBook.put(name, num);
			total++;
			line = read.readLine();
		}
		System.out.println("Total " + total + " persons.");
		read.close();
	}
}
