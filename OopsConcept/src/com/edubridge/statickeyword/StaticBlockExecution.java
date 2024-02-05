package com.edubridge.statickeyword;

public class StaticBlockExecution {
	int x;
	static String name;
	static {
		name = "Abhirami";
	}
	public static void print() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

}
