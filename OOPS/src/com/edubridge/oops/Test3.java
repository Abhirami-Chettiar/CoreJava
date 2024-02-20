package com.edubridge.oops;
class Student1{
	String name;
	
	Student1(String name){
	this.name=name;
	}
	void disp() {
		System.out.println(name);
	}
}
public class Test3 {

	public static void main(String[] args) {
		Student1 s1=new Student1("jhon");
		s1.disp();
		
	}

}
