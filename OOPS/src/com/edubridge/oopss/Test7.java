package com.edubridge.oopss;


 abstract class Animal{
	
	void eat() {
		System.out.println("Animal is eating");
	}
	
	abstract void bark() ;
	
}
class  Dog extends Animal{

	@Override
	void bark() {
		System.out.println("Dog is barking");
		
	}
	
}
public class Test7 {

	public static void main(String[] args) {
	Dog d1=new Dog();
	
	d1.bark();
	d1.eat();
	}

}
