package com.edubridge.interfacedemo;
import java.lang.*;
import java.util.Scanner;

public class EmployeeCloneableExecutor {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee id : ");
		int empId = sc.nextInt();
		System.out.print("Enter the employee name : ");
		String empName = sc.next();
		System.out.print("Enter the employee salary : ");
		long salary = sc.nextLong();
		
		Employee e1 = new Employee(empId,empName,salary);
//		/*override a clone method inside an implemented class to use over here*/
		Employee e3 = (Employee)e1.clone();
		e3.display();
		
//		 if we r not implementing a cloneable interface and if we r invoking the clone method in the driver class, we will get an exception as "ClassNotSupportedException"
//		
		
	}

}
