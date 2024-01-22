package com.edubridge.selectionstatements;
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a!=b) {
			System.out.println(a+" is not equal to "+b);
		}
		else {
			System.out.println(a+" is equal to "+b);
		}

	}

}
