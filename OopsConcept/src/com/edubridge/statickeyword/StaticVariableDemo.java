package com.edubridge.statickeyword;

public class StaticVariableDemo {
	//static keyword with variable name
	/* 1. When any var name is non-static and we are trying to access that variable inside the main method,then we will get error, so to avoid that we have to use static keyword with var name*/
	static float num = 56.90f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticVariableDemo d = new StaticVariableDemo();
//		System.out.println(d.num);
		System.out.println(num);

	}
}
