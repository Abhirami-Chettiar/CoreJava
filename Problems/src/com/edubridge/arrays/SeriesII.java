package com.edubridge.arrays;

import java.util.Scanner;

public class SeriesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int series = 6;
		for(int i=1;i<=num;i++) {
			
			System.out.print(series+" ");
			series = series+(i*5);
			
		}

	}

}
