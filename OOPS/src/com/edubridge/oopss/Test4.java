package com.edubridge.oopss;


class Account{
	void deposite() {
		int amount=1000;
		
		System.out.println(amount+"Rs Amount deposited");
	}
	void info() {
		this.deposite();
	}
}
public class Test4 {

	
	public static void main(String[] args) {
		
		Account a1=new Account();
		
		a1.info();

	}

}