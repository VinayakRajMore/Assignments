package com.te.thread;

public class DemoThread1 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 11; i < 20; i++) {
			if (i == 14) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(i + "== User 2 ==");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		DemoThread demoThread1 = new DemoThread();
		demoThread1.start();
		demoThread1.setName("Vinayak");
		demoThread1.setPriority(MAX_PRIORITY);
		System.out.println(DemoThread1.currentThread().getName());
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "== User 2 ==");
			Thread.sleep(1000);

		}

	}

}
