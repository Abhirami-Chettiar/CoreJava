package com.edubridge.arrays;

import java.util.Scanner;

public class Pattern101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
				
				
			}
			
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
