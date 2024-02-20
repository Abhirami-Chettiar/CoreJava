package com.edubridge.oopss;



class A{
	A(){
		System.out.println("This is default constructor for class A");
	}
	
	A(int i){
		this();
			System.out.println(i);
		
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A(10);
	}

}