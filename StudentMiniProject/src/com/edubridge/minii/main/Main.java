package com.edubridge.minii.main;

import java.util.Scanner;

import com.edubridge.minii.dao.StudentDao;
import com.edubridge.minii.pojo.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String my_name = sc.next();
		System.out.println("Welcome to Student Management System "+my_name);
		int ch=0;
		do{
			System.out.println("Press 1 to Add Student Record");
			System.out.println("Press 2 to Update Student Record");
			System.out.println("Press 3 to Delete Student Record");
			System.out.println("Press 4 to Show All Student Records");
			System.out.println("Press 5 to Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter Contact Number");
				String phone =sc.next();
				System.out.println("Enter city");
				String city = sc.next();
				Student s = new Student(name,phone,city);
				boolean b = StudentDao.insertStudentData(s);
				System.out.println("Data inserted successfully");
				break;
				
			case 2:
				System.out.println("Press 1 to Update Name ");
				System.out.println("Press 2 to Update Phone No ");
				System.out.println("Press 3 to Update City ");
				System.out.println("Enter value :");
				int val = sc.nextInt();
				if(val==1) {
//					Student s1= new Student();
					System.out.println("Enter the name you want to update");
					String sname =sc.next();
//					s1.setStudentName(sname);
					System.out.println("Enter id");
					int sid = sc.nextInt();
					StudentDao.updateStudentData(val, sname, sid, s1);
				}
				if(val==2) {
//					Student s1= new Student();
					System.out.println("Enter the phone no you want to update");
					String sphone =sc.next();
//					s1.setStudentPhone(sphone);
					System.out.println("Enter id");
					int sid = sc.nextInt();
					StudentDao.updateStudentData(val,sphone, sid, s1);
					
				}
				if(val==3) {
//					Student s1= new Student();
					System.out.println("Enter the city you want to update");
					String scity =sc.next();
//					s1.setStudentCity(scity);
					System.out.println("Enter id");
					int sid = sc.nextInt();
					StudentDao.updateStudentData(val,scity, sid, s1);
					
				}
				
				break;
			case 3:
				System.out.println("Enter the id you want to delete");
				int id=sc.nextInt();
				StudentDao.deleteStudentData(id);
				break;
			case 4:
				StudentDao.showAllStudent();
				break;
			case 5:
				System.out.println("Thank you !!!");
				break;
			default :
				System.out.println("Enter proper input");
				

		}

		}while(ch!=5);
		
}}
