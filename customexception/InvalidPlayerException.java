package com.te.corejava.customexception;

@SuppressWarnings("serial")
public class InvalidPlayerException extends RuntimeException {

	public InvalidPlayerException(String string) {
		super("Kindly provide player name");
	}

}
