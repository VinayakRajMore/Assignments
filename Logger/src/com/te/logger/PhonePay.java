package com.te.logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PhonePay {
	
	public static final Logger LOGGER = Logger.getLogger("");
	
	List<User> user;
	
	public PhonePay( ) {
		
		user = new ArrayList<>();
		
		LOGGER.setLevel(Level.ALL);
				
		try {

			 FileHandler fileHandler = new FileHandler("TransactionLog.log");
			 
			 fileHandler.setLevel(Level.ALL);
			 
			 LOGGER.addHandler(fileHandler);
			 
		} catch (SecurityException | IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void sendMoney (long phoneNumber, double amount) {
		
		List<User>collect = user.stream().filter(u -> u.getPhoneNumber() == phoneNumber).collect(Collectors.toList());
		
		if (!collect.isEmpty()) {
			
			User receiver = collect.get(0);
			
			double newBalance = receiver.getBalance()+amount;
			
			receiver.setBalance(newBalance);
			
			LOGGER.fine("The transaction is successful. You paid total amount of Rs. "+ amount + " to " + receiver.getName());
			
		}else {
			LOGGER.warning("User not Registered");
			
		
		
//		if (user.stream().anyMatch((User u) -> u.getPhoneNumber()== phoneNumber)) {
			
			
			
		}
		
		
	}

}
