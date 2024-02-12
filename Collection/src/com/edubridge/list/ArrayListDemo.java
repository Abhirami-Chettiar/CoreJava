package com.edubridge.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> obj = new ArrayList<>();
		obj.add("Abhirami");
		obj.add("Saniya");
		obj.add("Priyanka");
		
		System.out.println(obj);

		List<Object> obj1 = new ArrayList<>();
		obj1.add("Abhirami");
		obj1.add(15426);
		obj1.add(89.40);
		System.out.println(obj1);
		
		
		List<String> obj3 = new ArrayList<>();
		obj3.addAll(obj);
		System.out.println(obj3);
		
//		System.out.println(obj3.);
//		System.out.println(obj3.getFirst());
		System.out.println(obj3.remove(1));
		System.out.println(obj3);
		
		
	}

}
