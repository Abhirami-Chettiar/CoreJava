package com.edubridge.jumpstatements;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n = sc.nextInt();
//		System.out.print("\n");
		for(int i=1;i<=n;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
			
		}
	}

}
