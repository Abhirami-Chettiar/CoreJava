package com.edubridge.inheritance.multilevelinheritance;

public class Pulser180 extends PulserI{
	public int price;
	public int speed;
	public Pulser180(int speed, int price) {
		super(speed, price);
		this.price = price;
		this.speed = speed;
	}
	public String toString() {
		return "Pulser180[ Speed : "+speed+" Price: "+price +super.toString()+"]";
	}
	

}
