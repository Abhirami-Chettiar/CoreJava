package com.edubridge.com;
import java.util.regex.*;
public class PatternSyntaxExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Pattern p = Pattern.compile("[");
			Matcher m = p.matcher("Hello all");
		}
		catch(PatternSyntaxException pse) {
			System.out.println(pse.getDescription());
			System.out.println(pse.getIndex());
			System.out.println(pse.getMessage());
			System.out.println(pse.getPattern());
			System.out.println("This is an unchecked exception \nThank You!!!! :)");
		}
		
		
		
		
		

	}

}
