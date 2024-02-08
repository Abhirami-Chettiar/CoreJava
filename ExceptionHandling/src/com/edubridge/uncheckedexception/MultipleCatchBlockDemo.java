package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class MultipleCatchBlockDemo {

	public static void displayArray(int arr[]) {
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x =45;
		System.out.println("Enter y : ");
		int y = sc.nextInt();
		try {
			
			System.out.println(x/y);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);	
		}
		int arr[] = {12,5,75,90};
		MultipleCatchBlockDemo.displayArray(arr);

	}

}
