package com.edubridge.problemsii;

public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1;
		b1 = new BankA();
		System.out.println(b1.getRoi(7.6));
		b1 =new BankB();
		System.out.println(b1.getRoi(5.6));
		b1=new BankC();
		System.out.println(b1.getRoi(8.76));
		

	}

}
