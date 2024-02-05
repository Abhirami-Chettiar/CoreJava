package com.edubridge.inheritance.multilevelinheritance;

public class Suzuki extends SuperBikes{
	public String brand;

	

	public Suzuki(int minCapacity, String brand) {
		super(minCapacity);
		this.brand = brand;
	}
	public String toString() {
		return "Hayabusa[ Minimum Capacity : "+minCapacity+" Brand: "+brand +"]";
	}

	
}