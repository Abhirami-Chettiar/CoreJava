package com.edubridge.creational.singleton;

import java.sql.SQLException;
import java.util.Scanner;

public class SingletonDP {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("Singleton Creational Design Pattern");
		Scanner sc = new Scanner(System.in);
		
		JDBCSingleton jdbc = JDBCSingleton.getInstance();
		int choice=0;
		do {
			System.out.println("1.Insert");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter your Name");
				String name =sc.next();
				
				System.out.println("Enter your Password");
				String pass =sc.next();
				
				System.out.println("Enter your Id");
				int id =sc.nextInt();
				
				int i =jdbc.insert(name, pass, id);
				if(i>0) {
					System.out.println("Data entered successfully");
				}
				else {
					System.out.println("Data not entered");
				}
				break;
			case 2:
				jdbc.view();
				break;
			case 3:
				System.out.println("Enter the id : ");
				int eid  = sc.nextInt();
				System.out.println("Enter the new password");
				String password = sc.next();
				int i2 = jdbc.update(eid, password);
				if(i2>0) {
					System.out.println("Data updated successfully");
				}
				else {
					System.out.println("Data not updated");
				}
				break;
			case 4:
				System.out.println("Enter id : ");
				int empid = sc.nextInt();
				int i3 =jdbc.delete(empid);
				if(i3>0) {
					System.out.println("Data deleted successfully");
				}
				else {
					System.out.println("Data not deleted");
				}
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Enter valid choice");
				
			}
			
		}while(choice!=5);
		
		
	}

}
