package com.edubridge.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.Type-Safety
//		List list = new ArrayList();
//		list.add(10);
//		list.add("Abhirami");
		
		List<String> list1 = new ArrayList<>();
		list1.add("Abhirami");
		list1.add("78");
		
//		2.Type Casting is nor required
//		List list12 = new ArrayList();
		List<String> list12 = new ArrayList<>();
		list12.add("Abhirami");
		list12.add("78");
//		without generic, typecasting is required
//		String str1 = (String) list12.get(0);
		
		
		String str1 = list12.get(0);
		System.out.println(str1);
	}

}
