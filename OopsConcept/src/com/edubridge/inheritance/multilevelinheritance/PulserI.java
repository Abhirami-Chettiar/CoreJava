package com.edubridge.inheritance.multilevelinheritance;

public class PulserI {
	public int speed;
	public int price;
	public PulserI(int speed, int price) {
		super();
		this.speed = speed;
		this.price = price;
	}
	public String toString() {
		return "Pulser[ Speed : "+speed+" Price: "+price +" Model : "+"]";
	}
	
}
