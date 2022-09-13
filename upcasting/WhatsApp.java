package com.te.corejava.upcasting;

public class WhatsApp {
	
	public static void main(String[] args) {
		User user = new User();
		user.name="Pushpa";
		user.phoneNumber = 9876543210l;
		user.text();
		user.call();
		System.out.println("============================");
		User user1=new Admin();
		user1.name="Rocky";
		user1.phoneNumber = 9087564312l;
		user1.text();
		user1.call();
		
		Admin ad = (Admin) user1;
		ad.addUser("Srivalli");
		System.out.println(ad.name);
	}

}
