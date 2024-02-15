package com.edubridge.com;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Happy Birthday to you";
		String[] s1 = s.split("\\s");
		for(String s2 : s1) {
			System.out.println(s2);
		}
		
		String snew = "www.edubridge.com";
		String[] s1new = snew.split("[.]");
		for(String s2 : s1new) {
			System.out.println(s2);
		}
	String snew1 = "There are 4 members in my family";	
	System.out.println(snew1);	
	String str= snew1.replaceAll("[\\d+]", " four");
	 System.out.println(str);
	}

}
