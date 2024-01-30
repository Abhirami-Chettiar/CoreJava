package com.edubridge.proble;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class Occurence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a =sc.nextLine();
		a = a.replaceAll("the ", "");
		System.out.println(a);

	}

}
