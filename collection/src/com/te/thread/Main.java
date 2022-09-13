package com.te.thread;

public class Main {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyThread());
		thread.start();
		
		Thread thread2 = new Thread(new MyThread());
		thread.start();
		thread2.start();
		thread.setPriority(10);
		
//		MyThread myThread = new MyThread();
	}

}
