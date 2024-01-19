package com.edubridge.compileinput;
import java.util.Scanner;
public class CharBooleanDemo {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char a = s.next().charAt(1);
		boolean b = true;
		System.out.println("String : "+str);
		System.out.println("character : "+a);
		System.out.println("Boolean value : "+b);
		s.close();

	}

}
