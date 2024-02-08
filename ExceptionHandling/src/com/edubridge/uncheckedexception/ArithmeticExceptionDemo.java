package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 15;
		System.out.println("Enter y: ");
		try {
			int y = sc.nextInt();
			System.out.println(x/y);
			/*
			 * When we use System.exit(0) inside try and catch block it will finally block 				being executed */
//			System.exit(0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception Occured : "+ae);
//			System.exit(0);
			
		}
		finally {
//			System.exit(0);
			/*
			 * Finally block will not get executed if there is an exception in the finally 				block*/
//			System.out.println(12/0);
			System.out.println("This is the final block");
		}
	}

}
