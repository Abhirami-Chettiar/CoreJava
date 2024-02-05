package com.edubridge.inheritance.multilevelinheritance;

public class Hayabusa extends Suzuki {
	public String model;
	public int xprice;
		
public Hayabusa(int minCapacity, String brand, String model, int xprice) {
		super(minCapacity, brand);
		this.model = model;
		this.xprice = xprice;
	}


	
	public String toString() {
		return "Hayabusa[ Minimum Capacity : "+minCapacity+" Brand: "+brand +" Model : "+model+" Price : "+xprice+"]";
	}
}
