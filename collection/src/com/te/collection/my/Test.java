package com.te.collection.my;

public class Test {

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		myArrayList.add(11);
		myArrayList.add(12);
		myArrayList.add(13);
		myArrayList.add(14);
		myArrayList.add(15);
		myArrayList.add(16);
		myArrayList.add(17);
		myArrayList.add(18);
		myArrayList.add(19);
		myArrayList.add(20);
		myArrayList.add(21);
		myArrayList.add(22);

		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println(MyArrayList.get(i));
		}
	}
}
