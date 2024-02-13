package com.edubridge.equalsdemo;

public class EqualsExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Biriyani";
		String str2 = "Biriyani";
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		
		String str3 = new String("Curd Rice");
		String str4 = new String("Curd Rice");
		System.out.println(str3.equals(str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		
		
		Site s = new Site("Biriyani",300);
		Site s1 = new Site("Biriyani",300);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}
