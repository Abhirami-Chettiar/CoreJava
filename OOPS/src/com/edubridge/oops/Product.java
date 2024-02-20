package com.edubridge.oops;

public class Product {
	String pName;
	int cost;
	public void  display(String pname , int pcost) {
		pName = pname;
		cost = pcost;
		System.out.println("Product Name : "+pName + ", Cost : "+cost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.display("HP Laptop", 38000);
		p1.display("Noise buds", 2000);
		p1.display("Boult Bluetooth Neckband", 1500 );

	}

}
