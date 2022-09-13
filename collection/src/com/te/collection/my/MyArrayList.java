package com.te.collection.my;

import java.util.Arrays;

public class MyArrayList {

	private Object[] array;
	private int index;
	private int size;

	public MyArrayList() {
		array = new Object[10];
	}

	public int size() {
		size = index;
		return size - 1;
	}

	public void add(Object obj) {
		if (index > array.length - 1) {
			increaseCapacity();
		}
		array[index] = obj;
		index++;
	}

	private void increaseCapacity() {
		Object[] temp = new Object[((array.length * 3) / 2) + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public Object get(int index) {
		return array[index];

	}

	@Override
	public String toString() {
		return "MyArrayList [array = " + Arrays.toString(array) + ", index =" + index + "]";
	}

}
