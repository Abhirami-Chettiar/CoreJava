package com.edubridge.oops;
class Calculation{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(String str) {
		System.out.println(str);
	}
}
public class PolyI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c1 = new Calculation();
		c1.add(23, 45);
		c1.add(23,56,8);
		c1.add("hello");
	}
}
