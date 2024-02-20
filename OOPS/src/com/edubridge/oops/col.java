package com.edubridge.oops;

import java.util.ArrayList;
import java.util.List;



public class col {
	public static void main(String[] args) {
		List<String> obj3 = new ArrayList<>();
		obj3.add("Abhirami");
		obj3.add("Saniya");
		System.out.println(obj3);
		
		System.out.println(obj3.getLast());
		System.out.println(obj3.getFirst());
		System.out.println(obj3.remove(1));
		System.out.println(obj3);
	}
	

}
