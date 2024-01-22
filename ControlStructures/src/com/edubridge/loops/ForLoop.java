package com.edubridge.loops;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n = sc.nextInt();
//		System.out.print("\n");
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
			
		}
		System.out.print("\n");
		
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
			
		}

	}

}
