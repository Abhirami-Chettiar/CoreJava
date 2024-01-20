package com.edubridge.operators;
import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Logical AND:"+(a==3 && b>a));
		System.out.println("Logical OR:"+(a==3 || b>a));
		System.out.println("Logical NOT:"+(!(a<=b)));

	}

}
