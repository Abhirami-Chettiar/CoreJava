package com.edubridge.list;
import java.util.Deque;
import java.util.LinkedList;
public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> obj1 = new LinkedList<>();
		obj1.add(45);
		obj1.add(56);
		obj1.add(10);
		obj1.add(2);
		System.out.println(obj1);
		obj1.addFirst(1);
		obj1.removeLast();
		System.out.println(obj1);
		System.out.println(obj1.peek());
		
		System.out.println(obj1);
		obj1.pollLast();
		obj1.pollLast();
		obj1.pollLast();
		obj1.pollLast();
		System.out.println(obj1);
		obj1.pollLast();
		System.out.println(obj1);
		
//		obj1.removeLast();
//		obj1.removeLast();
//		obj1.removeLast();
//		obj1.removeLast();
//		obj1.removeLast();
//		
	}

}
