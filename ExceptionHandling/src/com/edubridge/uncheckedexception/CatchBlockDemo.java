package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class CatchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x =45;
		System.out.println("Enter y : ");
		int y = sc.nextInt();
		int arr[] = {12,5,75};
		try {
			
			System.out.println(x/y);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);	
			/*
			 * if(ae instanceof ArithmeticException)
			 * 		System.out.println(e1);
			 * else
			 * 		System.out.println(e1);
			 * */
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		
		finally {
			System.out.println("This is finally block");
		}
		
		

	}

}
