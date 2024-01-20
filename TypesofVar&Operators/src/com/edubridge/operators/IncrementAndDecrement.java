package com.edubridge.operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 6;
		int b = 3;
		int res = a++ - ++b;
		int re2 = --a + b--;
		System.out.println(a);
		System.out.println(b);

	}

}
