package com.edubridge.arrays;

import java.util.Scanner;

public class FindInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];
		int i=0;
		
		for(i=0;i<input;i++) {
			arr[i] = sc.nextInt();
		}
		
		int find = sc.nextInt();
		for(i=0;i<input;i++) {
			if(arr[i] == find) {
				System.out.println(find +" is present in the array");
				return;
			}
			
		}
		System.out.println(find+" is not in the given array");
		
		

	}

}
