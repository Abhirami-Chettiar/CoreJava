package com.edubridge.jumpstatements;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n = sc.nextInt();
//		System.out.print("\n");
		for(int i=1;i<=n;i++) {
			if(i==10) {
				break;
			}
			System.out.print(i+" ");
			
		}
	}

}
