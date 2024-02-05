package com.edubridge.polymorphism;
class Stocks{
	String shareName;
	long sharePrice;
	String shareType;
	
	static void displayStockDetails(String shareName,long sharePrice) {
		System.out.println(shareName +" "+sharePrice);	
	}
	static void displayStockDetails(String shareName,String shareType) {
		System.out.println(shareName +" "+shareType);	
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stocks.displayStockDetails("Birla", 2500);
		Stocks.displayStockDetails("Birla", "Nifty-Fifty");

	}

}
