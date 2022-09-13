package com.te.logger;

public class User {
		
		private String name;
		private String upiId;
		private long phoneNumber;
		private double balance;
		
		
		
		public User(String name, String upiId, long phoneNumber, double balance) {
			super();
			this.name = name;
			this.upiId = upiId;
			this.phoneNumber = phoneNumber;
			this.balance = balance;
		}
		
		public User() {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getUpiId() {
			return upiId;
		}
		
		public void setUpiId(String upiId) {
			this.upiId = upiId;
		}
		
		public long getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
		
	
}
