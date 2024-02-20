package com.edubridge.problemsii;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		String str1 = "hello";
		int len = str.length();
		String rev="";
		char[]  arr = new char[5];
		arr = str.toCharArray();
		int flag = 0;
		
		for(int i=len-1;i>=0;i--) {
			if(arr[i]==arr[len-1-i]) {
				flag =1;
			}
			else {
				System.out.println("This is not a palindrome");
				return;
			}
		}
		System.out.println("This is a Palindrome");
		
		

	}

}
