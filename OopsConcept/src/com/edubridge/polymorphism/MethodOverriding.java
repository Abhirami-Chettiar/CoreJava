package com.edubridge.polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleMeet g1 = new GoogleMeet();
		g1.accept("GoogleMeet", "gmeet@gmail.com");
		System.out.println(g1 instanceof Google);

	}

	
}
