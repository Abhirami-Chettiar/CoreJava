package com.edubridge.varoperators;

public class TypesOfVar {
	//instance variable
		float sal = 50000.9f;
	//static variable
		static int n = 58;
		
		String display()
		{
				char v = 'q';
			//local variable
			return "Local variable "+ v;
		}
	public static void main(String[] args) {
		TypesOfVar obj = new TypesOfVar();
		System.out.println(obj.sal);
		System.out.println(n);
		System.out.println(obj.display());
		}

}
