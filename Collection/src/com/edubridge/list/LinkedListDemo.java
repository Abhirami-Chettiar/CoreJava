package com.edubridge.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj = new LinkedList<>();
		obj.add(11);
		obj.add(9);
		obj.add(45);
//		System.out.println("List is "+ obj);
		obj.add(0,5);
//		System.out.println("List is : "+ obj);
		Collections.sort(obj);
		Collections.reverse(obj);
		System.out.println(obj);
// 		for(Integer itr:obj) {
//			System.out.print(itr + " ");
//		}
//		
		
//		Iterator<Integer> itr = obj.listIterator();
//		while(itr.hasNext()) {
//			
//		}
//		System.out.println(obj.contains(10));
//		System.out.println(obj.getClass());
//		obj.clear();
//		System.out.println(obj);
		
	}

}
