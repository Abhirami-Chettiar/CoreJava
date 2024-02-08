package com.edubridge.interfacedemo;
/* Program to demonstrate on Cloneable*/
public class Employee implements Cloneable{
	public int empId;
	public String empName;
	public long salary;
	public Employee(int empId, String empName, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	void display() {
		System.out.println("Emp ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+salary);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
