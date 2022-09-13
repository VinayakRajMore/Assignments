package com.te.thread.join;

public class BoyFriend {

	public static void main(String[] args) throws InterruptedException {
		GirlFriend girlFriend = new GirlFriend();
		Thread.currentThread().setName("Balya");
		girlFriend.setName("Shalu");
		girlFriend.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("Kuthayes!!!! Ye li lavkar");
			Thread.sleep(1000);
		}
		try {
			girlFriend.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Shalu aali..........");
		Thread.sleep(1000);
		System.out.println("Gele dogh Fadtare chi misal khayla ");
		Thread.sleep(1000);
		System.out.println("Chala,Ata Rankala");
		Thread.sleep(1000);
		System.out.println("Ajun Ambabai la jaychay");
		Thread.sleep(1000);
		System.out.println("Basss, damlo.... Jauya ata gharla");
	}

}
