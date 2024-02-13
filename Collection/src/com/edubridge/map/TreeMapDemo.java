package com.edubridge.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<String,Float> obj = new TreeMap<>();
		obj.put("Hand Wax", 250.00f);
		obj.put("Hair cut", 400.00f);
		obj.put("Hair Spa", 500.00f);
		obj.put("Facial", 650.00f);
		obj.put("Manicure", 350.00f);
		
		for(Map.Entry<String, Float> itr:obj.entrySet()) {
			System.out.println(itr.getKey()+" "+itr.getValue());
		}

	}

}
