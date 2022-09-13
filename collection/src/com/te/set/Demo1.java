package com.te.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(100);
		hashSet.add(10);
		hashSet.add(69);
		hashSet.add(45);
		hashSet.add(49);
		hashSet.add(8752);
		
		List<Integer> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList);
		Iterator<Integer> iterator = arrayList.iterator();
		
		arrayList.remove(2);     
		
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			System.out.println(integer);
			
		}
	}
}
