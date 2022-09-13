package com.te.corejava.customexception;

public class Election {

	public void vote(int age) {
		if (age < 18) {
			try {
				throw new NotEligibleException("The voter is not eligible");
			} catch (NotEligibleException e) {
				System.out.println(e.getMessage());
			}
		} else
			System.out.println("Casted vote successfully");

	}
	
	public static void main(String[] args) {
		
		Voter voter = new Voter (1,"Scott", 21);
		Voter voter2 = new Voter (2,"Tiger", 15);
		
		Election election = new Election();
		election.vote(voter.getAge());
		election.vote(voter2.getAge());
		
		
	}
}
