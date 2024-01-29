package com.edubridge.stringbufferdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder("Abhirami");
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder("I hate noodles");
		System.out.println(sb2.capacity());//30
		
		//StringBuffer a = new StringBuffer(sb2.append(" and lollipops"));
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		//System.out.println(a.capacity());
		sb2.append(" and lollipops");
		System.out.println(sb2.capacity());

	}

}
