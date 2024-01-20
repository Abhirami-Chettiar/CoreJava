package com.edubridge.operators;
import java.util.Scanner;
public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Bitwise AND :" + (a&b));
		System.out.println("Bitwise OR :" + (a|b));
		System.out.println("Bitwise XOR :" + (a^b));
		System.out.println("Left Shift :" + (a<<b));
		System.out.println("Right Shift:" + (a>>b));
	}

}
