package com.edubridge.thiskeyword;
class ThisDemo{
	public int x;
	ThisDemo(){
		this(34);
		System.out.println("Non-Parameterized Constructor");
	}
	ThisDemo(int a){
		x = a;
		System.out.println("Parameterized Constructor and the input is "+x);
		
	}
}

public class ThisKeywordDemoThree {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo d = new ThisDemo();

	}

}
