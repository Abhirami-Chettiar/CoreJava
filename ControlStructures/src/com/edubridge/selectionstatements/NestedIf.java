package com.edubridge.selectionstatements;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		
		if(age>=12) {
			System.out.println("Enter yout weight : ");
			float weight = sc.nextFloat();
			if(weight>=45 && weight<=110) {
				System.out.println("Congrats , You are eligible for Bungee Jumping :)");
			}
			else if(weight>110) {
				System.out.println("You are eligible for the Jump .\n Dont worry Extra Ropes will be provided for your Safety as your Safety is our concern ");
			}
			else {
				System.out.println("Sorry , You are not eligible!!! . Gain weight and come again :)");
			}
		}
		else {
			System.out.println("Oops! Sorry you are not eligible for Bungee Jumping. Come After "+(12-age)+" years");
		}
		
	}

}
