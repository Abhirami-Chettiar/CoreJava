package com.edubridge.loops;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		do
		{
			System.out.print(n+" ");
			n++;
		}while(n<25);

	}

}
