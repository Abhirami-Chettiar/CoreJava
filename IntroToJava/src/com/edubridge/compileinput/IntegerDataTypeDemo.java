package com.edubridge.compileinput;

import java.util.Scanner;
public class IntegerDataTypeDemo {
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		byte a = s.nextByte();
		short b = s.nextShort();
		int c = s.nextInt();
		long d = s.nextLong();
		System.out.println("The byte num value is:"+ a);
		System.out.println("The short num value is:"+ b);
		System.out.println("The int num value is:"+ c);
		System.out.println("The long num value is:"+ d);
		
		s.close();
	
	}

}
