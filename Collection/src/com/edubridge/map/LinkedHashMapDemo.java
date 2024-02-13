package com.edubridge.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> obj1 = new LinkedHashMap<>();
		obj1.put(5, "Chichen Tandoori Momos");
		obj1.put(1, "Veg Momos");
		obj1.put(2, "Paneer Momos");
		obj1.put(8, "Peri Peri Momos");
		obj1.put(3, "Achaari Momos");
		obj1.put(1, "Chicken Cheese Momos");
		
		obj1.put(6, "Prawn Fried Momos");
//		System.out.println(obj1);
//		System.out.println(obj1.containsKey(1));
//		obj1.remove(1);
//		System.out.println(obj1);
		
		for(Entry itr:obj1.entrySet()) {
			
			System.out.println(itr.getKey()+ " "+itr.getValue());
		}
	}

}
