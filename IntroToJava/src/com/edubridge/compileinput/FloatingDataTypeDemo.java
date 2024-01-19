package com.edubridge.compileinput;

import java.util.Scanner;

public class FloatingDataTypeDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		float x = s.nextFloat();
		double y = s.nextDouble();
		System.out.println("The float value is: "+x);
		System.out.println("The Double float value is "+y);
		s.close();

	}

}
