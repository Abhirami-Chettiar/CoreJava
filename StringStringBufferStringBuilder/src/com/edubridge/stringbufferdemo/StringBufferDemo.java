package com.edubridge.stringbufferdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Abhirami");
		StringBuffer sb = new StringBuffer("Abhirami");
		System.out.println(sb.capacity());
		
		
		StringBuffer sb1 = new StringBuffer(s.length());
		System.out.println(sb1.capacity());
		//capacity() cannot be used with normal string.
		//capacity() default size is 16.
		
		StringBuffer sb3 = new StringBuffer("Abhirami and Saniya are friends");
		System.out.println(sb3.capacity());
		
//		sb2 = new StringBuffer(" ");
//		System.out.println(sb2.capacity());
		
		/*
		 * As String is immutable , we can't do any modification
		 */
		sb3.append(" from 20.");
		System.out.println(sb3);
		
		//predict output
		StringBuffer sb4 = new StringBuffer("Try");
		sb4.setCharAt(3, 'x');
		System.out.println(sb4);
		
	}

}
