package com.edubridge.arrays;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		String str1 = "hello";
		int len = str.length();
		String rev="";
		char[]  arr = new char[5];
		arr = str.toCharArray();
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+arr[i];
		}
		System.out.println(rev);
		

	}

}
