package com.te.thread.join;

public class GirlFriend extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thamb ki thamb, alo " );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
