//Program to run hierarchial inheritance






package com.edubridge.inheritance.hierarchialinheritance;

public class HierarchialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiramisu t =  new Tiramisu();
		SnowCore c =  new SnowCore();
		t.deviceName = "OPPO F21s Pro 5G";
		t.version = "Android 13";
		c.deviceName = "Redmi Note 11T 5G";
		c.version = "Android 12";
		t.print();
		c.print();
		}

	}


