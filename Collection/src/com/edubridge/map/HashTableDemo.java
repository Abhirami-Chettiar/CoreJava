package com.edubridge.map;

import java.util.Hashtable;

import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> obj = new Hashtable<>();
		obj.put("Phone no", 8765498765l);
		obj.put("City", "Ambernath");
		obj.put("Pincode", 421505);
		obj.put("Name", "Saniya");
		obj.put("Roll no",45);
		
		//If we use null in key or value , we will get NullPointer Exception
		
		for(Map.Entry itr:obj.entrySet()) {
			System.out.println(itr.getKey()+" "+itr.getValue());
			
		}
		

	}

}
