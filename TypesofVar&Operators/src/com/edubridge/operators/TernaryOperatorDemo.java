package com.edubridge.operators;
import java.util.Scanner;
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String ans =(a%2==0?"Even":"Odd");
		System.out.println(ans);

	}

}
