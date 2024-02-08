package com.edubridge.interfacedemo;

public class LimeLight implements Cafe {

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu : "+menu);
	}

	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price for "+menu +" : "+price);
		
	}

}
