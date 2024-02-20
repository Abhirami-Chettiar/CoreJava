package com.edubridge.oops;

class Dog{
	String color = "Black";
}
class Cat extends Dog{
	String color = "Brown";
	String color1 = "White";	
//	
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		System.out.println(c1.color+c1.color1);
		Dog d1 = new Cat();
		System.out.println(d1.color);

	}

}
