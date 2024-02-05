package com.edubridge.thiskeyword;
/*This keyword is used to pass inside the method name*/

public class ThisKeywordDemoTwo {
	int a;
	void printOne(ThisKeywordDemoTwo d1) {
		System.out.println("HIII ALL , A VERY GOOD MORNING :)"+this.a);
	}
	void printTwo(int a) {
		this.a = a;
		printOne(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoTwo d = new ThisKeywordDemoTwo();
		d.printTwo(10);

	}

}
