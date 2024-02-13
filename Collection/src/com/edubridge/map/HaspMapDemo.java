package com.edubridge.map;

import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HaspMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> obj = new HashMap<>();
		obj.put(7, "Peri-Peri Momos");
		obj.put(3, "Achaari Momos");
		obj.put(1, "Veg Momos");
		obj.put(2, "Paneer Momos");
		
		obj.put(1, "Chicken Cheese Momos");
		obj.put(5, "Chichen Tandoori Momos");
		obj.put(6, "Prawn Fried Momos");
//		System.out.println(obj);
//		System.out.println(obj.containsKey(1));
//		obj.remove(1);
//		System.out.println(obj);
		
		
//		To extract the elements from the map
		for(Entry itr:obj.entrySet()) {
			
			System.out.println(itr.getKey()+ " "+itr.getValue());
		}
		
		
		

	}

}
