package com.te.corejava.abstraction.inter;

public class Casio implements Calculator,ScientificCalci {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int subtract(int x, int y) {
		return x-y;
	}
	
	@Override
	public String trignometric(String angel1, String angel2) {
		
		if(angel1.equals("sin") && angel2.equals("cos")) {
			return "tan";
		
	}
	
		return "I Don't Know";
	
	}

}
