package com.edubridge.abstractclassdemo;

import java.util.Scanner;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISRO i1 = new ISRO();
		
		Scanner sc = new Scanner(System.in);
		i1.displayDetails(i1.setAgencyName(sc.nextLine()), i1.setBudget(sc.nextLong()));
		i1.displayDetails();
		String str = i1.print();
		System.out.println(str);
	}

}
