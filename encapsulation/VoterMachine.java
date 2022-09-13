package com.te.corejava.encapsulation;

public class VoterMachine {
	public static void main(String[] args) {
		
		Voter voter = new Voter();
		voter.setId(123);
		voter.setName("Mr. Under Age");
		voter.setAge(18);
		
		Voter voter2 = new Voter();
		voter2.setId(124);
		voter2.setName("Mr. Voter");
		voter2.setAge(21);
	}
	

}
