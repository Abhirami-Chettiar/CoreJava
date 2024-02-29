package com.edubridge.problemsii;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String input2 = sc.nextLine();
		String input =input2.toLowerCase();
		int vowel_count=0;
		int constant_count=0;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
				System.out.println(input2.charAt(i)+" is a vowel");
				vowel_count++;
			}
			else {
				System.out.println(input2.charAt(i)+" is not a vowel");
				constant_count++;
			}

	}
		System.out.println("The total no. of vowels is "+vowel_count);
		System.out.println("The total no. of vowels is "+constant_count);


}
}
