package com.te.collection.my;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray {
	private Object[] array;
	private int index;
	private int size;

	public MyArray() {
		array = new Object[10];
	}

	public int size() {
		size = index;
		return size - 1;
	}

	public void add(Object obj) {
		if (index >= array.length - 1) {
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

	public Object get(Object obj) {
		for (int i = 0; i < index; i++) {
			if (array[i].equals(obj)) {
				for (int j = i; j < index; j++) {
					array[j] = array[j + 1];
				}
			}

		}
		return array[index];

	}

	@Override
	public String toString() {
		return "MyArrayList [array = " + Arrays.toString(array) + ", index =" + index + "]";
	}

	public void remove(int i) {

	}

	public Iterator<Object> iterator() {
		return new MyItr();
	}

	class MyItr implements Iterator<Object> {

		int index;

		@Override
		public boolean hasNext() {
			if (array[index] != null)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			Object object = array[index];
			index++;
			return object;
		}

	}

}
