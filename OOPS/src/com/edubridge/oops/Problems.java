package com.edubridge.oops;
/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/

class Member{
	String name;
	int age;
	long phoneNo;
	String address;
	int Salary;
	void printSalary() {
		System.out.println(Salary);
	}
}
class Employee extends Member{
	String specialization;
	String department;
}
class Manager extends Member{
	String specialization;
	String department;
	
}

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		e1.name = "Rayyan";
		e1.age = 45;
		e1.phoneNo = 7891726423L;
		e1.address =" XYZ Apartment , ABC Colony , Near Twin Tower,Kuala Lumpur , Malaysia";
		e1.Salary = 290;
		e1.specialization = "Cloud";
		e1.department = "IT";
		
		e1.name = "Rayyan";
		e1.age = 45;
		e1.phoneNo = 7891726423L;
		e1.address =" XYZ Apartment , ABC Colony , Near Twin Tower,Kuala Lumpur , Malaysia";
		e1.Salary = 290;
		e1.specialization = "Cloud";
		e1.department = "IT";
		
		
		
		

	}

}
