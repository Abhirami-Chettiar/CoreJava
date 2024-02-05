package com.edubridge.inheritance.multilevelinheritance;

public class Pulser220 extends Pulser180{
	
	public int price;
	public int speed;
	public Pulser220(int speed, int price) {
		super(speed, price);
		this.price = price;
		this.speed = speed;
	}
	public String toString() {
		return "Pulser220[ Speed : "+speed+" Price: "+price +super.toString()+"]";
	}

}
