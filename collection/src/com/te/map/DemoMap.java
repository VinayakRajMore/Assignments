package com.te.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Tony");
		map.put(2, "Steve");
		map.put(3, "Wanda");
		map.put(4, null);
		map.put(null, "Chris");
		map.put(null, "Natasha");

//		String string = map.get(null);
//		System.out.println(string);

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println(key + ":::" + map.get(key));
		}

//		for (Map.Entry<Integer, String> entry : map.entrySet()) {
//			Integer key = entry.getKey();
//			String val = entry.getValue();

	}

}
