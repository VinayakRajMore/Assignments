package com.te.thread.surprise;

public class Irctc {
	int noOfTickets = 100;

	public void bookTicket(int tickets, String name) {
		
//	public synchronized void bookTicket(int tickets, String name) {
//	we can have synchronized method also insted of bclock
		
		System.out.println("IRCTC madhye swagat ahe " + name);
		System.out.println("Kay madat pahije bola");

		// noOfTickets = noOfTickets - tickets
		synchronized (this) {

			if (noOfTickets > tickets) {
				noOfTickets -= tickets;
				System.out.println("Zal booking tumch..." + tickets + " tickets ch... Enjoy your journey " + name);
			} else {
				System.err.println(name + ", Ushir zala rao tumhala... Attach samplit sagali...");
				return;
			}
			
			System.out.println("Shillak Tickets == " + noOfTickets);

		}
	}

}
