package com.edubridge.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> obj = new HashSet<>();
		obj.add("Zara");
		obj.add("Alhena");
		obj.add("Jennifer");
		obj.add("Jerlin");
		System.out.println(obj);
		
		Set<Object> obj1 = new LinkedHashSet<>();
		obj1.add("Zara");
		obj1.add("Alhena");
		obj1.add("Jennifer");
		obj1.add(90);
		System.out.println(obj1);
		
		SortedSet<Object> obj3 = new TreeSet<>();
		obj3.add("Zara");
		obj3.add("Alhena");
		obj3.add("Jennifer");
		obj3.add("Jannet");
		System.out.println(obj3);
		
	}

}
