package com.edubridge.oops;


class Animal{
	void eat() {
		System.out.println("Animal behavoiur");
	}

}

class Cat1{
	void eat() {
		System.out.println("Cat Animal behavoiur");
	}
}
class Dog1{
	void eat() {
		System.out.println("Dog Animal behavoiur");
	}
}

public class PolyII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a1=new Animal();
		
		Cat1 c1=new Cat1();
		
		Dog1 d1=new Dog1();
		
		a1.eat();
		c1.eat();
		d1.eat();

	}

}
