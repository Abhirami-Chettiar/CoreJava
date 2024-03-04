package com.edubridge.creational;
class BOI implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Interest for BOI : "+ rate);
		
	}
	
}
class SBI implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Interest for SBI : "+ rate);
		
	}
	
}
class BOB implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Interest for BOB : "+ rate);
		
	}
	
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI b1 = new SBI();
		b1.getRoi(7.2);
		BOB b2 = new BOB();
		b2.getRoi(8.42);
		BOI b3 = new BOI();
		b3.getRoi(9.7);

	}

}
