package com.edubridge.selectionstatements;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Map_no:");
		int map_no = sc.nextInt();
		switch(map_no) {
		case 1:
			System.out.println("Welcome to Livik");
			break;
		case 2:
			System.out.println("Welcome to Erangel");
			break;
		case 3:
			System.out.println("Welcome to Miramar");
			break;
		case 4:
			System.out.println("Welcome to Nusa");
			break;
		case 5:
			System.out.println("Welcome to Sanhok");
			break;
		case 6:
			System.out.println("Welcome to Vikendi");
			break;
		case 7:
			System.out.println("Welcome to VR-AI");
			break;
		case 8:
			System.out.println("Welcome to TDM");
			break;
		default:
			System.out.println("INVALID MAP NUMBER");
		}
		
		

	}

}
