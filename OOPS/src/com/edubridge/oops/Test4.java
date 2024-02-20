package com.edubridge.oops;

class Bank{
	String bankName="Bank of India";
	String address="mumbai";
	String emailId="boi@gmail.com";
	
}

class Facility extends Bank{
	
	float roi=8.5f;
	void show() {
		System.out.println("Bank name is:"+bankName+"\n rate of intrest:"+roi);
	}
	
}

class Info extends Bank{
	
	
	void show1() {
		System.out.println("Bank name is:"+bankName+"\nbank address is:"+address+"\nEmail Id is:"+emailId);
	}
}

public class Test4 {

	public static void main(String[] args) {
		Facility f1=new Facility();
		
		Info i1=new Info();
		
		f1.show();
		i1.show1();
		
		/*Bank b1;
		
		b1=new Facility();
		b1=new Info();*/
		
		
	}

}