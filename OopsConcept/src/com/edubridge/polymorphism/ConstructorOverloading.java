package com.edubridge.polymorphism;
class Renault{
	String carName;
	int noOfSeater;
	String color;
	String engine;
	float price;
	Renault(String carName,int noOfSeater,String color){
		this.carName=carName;
		this.noOfSeater = noOfSeater;
		this.color = color;
		System.out.println(carName +" "+noOfSeater+" "+color);
		
	}
	Renault(String carName,String engine,float price){
		this.carName=carName;
		this.engine = engine;
		this.price = price;
		System.out.println(carName+ " "+engine+ " "+price);
		
	}
}

public class ConstructorOverloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Renault r1 = new Renault("RXE",6,"Yellow");
		Renault r2 = new Renault("Duster","CNG",85.0F);
	}

}
