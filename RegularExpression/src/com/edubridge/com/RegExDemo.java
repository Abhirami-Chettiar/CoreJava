package com.edubridge.com;
import java.util.regex.*;
public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "abc@gmail.com";
		Pattern p = Pattern.compile("[a-zA-Z0-9]{2,}@gmail[.]com");
		Matcher m = p.matcher(email);
		if(m.find() && m.group().equals(email)) {
				System.out.println("This is a valid email address");
			}
			else {
				System.out.println("This is not a valid email address");
			}
		System.out.println(m.matches());
			
		}
	

}
