package com.te.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
	
	public static final Logger LOGGER = Logger.getLogger(LoggerDemo.class.getName());
	
	public static void main(String[] args) throws SecurityException, IOException {
		
//		FileHandler fileHandler = null;
//		try {
//			fileHandler = new FileHandler("LoggerDemo.log");
//			
//		} catch (SecurityException e) {
//			
//			e.printStackTrace();
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//			
//		}
		
		FileHandler fileHandler2 = new FileHandler("D:\\LogFile.log");
		fileHandler2.setLevel(Level.ALL);
		
		MyFormatter myFormatter = new MyFormatter();
		fileHandler2.setFormatter(myFormatter);
		
//		ConsoleHandler consoleHandler = new ConsoleHandler();
//		consoleHandler.setLevel(Level.FINEST);
		
		LOGGER.addHandler(fileHandler2);
		
//		LOGGER.addHandler(fileHandler);
		LOGGER.setLevel(Level.ALL);
		
		
		LOGGER.severe("I'm Sever");
		LOGGER.warning("I'm Warning"); 
		LOGGER.info("I'm Info");
		LOGGER.config("I'm Config");
		LOGGER.fine("I'm Fine");
		LOGGER.finer("I'm Finer");
		LOGGER.finest("I'm Finest");
	}

}
