package com.te.thread;

public class DemoThread extends Thread {
	@Override
	public void run() {
		for (int i = 11; i < 20; i++) {
			System.out.println(i+"== User 1 ==");

		}
	}

	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis());
		DemoThread demoThread = new DemoThread();
		demoThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"== User 1 ==");
			
		}
		
		

	}

}
