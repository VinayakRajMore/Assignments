package com.te.thread.surprise;

public class User extends Thread{
	String name;
	int tickets;
	Irctc irctc;
	
	public User (String name, int tickets, Irctc irctc) {
		super();
		this.name = name;
		this.tickets = tickets;
		this.irctc = irctc;
}
	@Override
	public void run() {
		irctc.bookTicket(tickets, name);
	}
	
	

}
