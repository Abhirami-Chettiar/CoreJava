package com.edubridge.loops;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		int digit =0;
		do {
			digit = digit+1;
			num = num/10;
			
		}while(num>0);
		System.out.println(digit);
	}

}
