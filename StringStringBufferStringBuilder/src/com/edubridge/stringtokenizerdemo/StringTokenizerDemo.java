package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer t = new StringTokenizer(""+"Hey there, I am using String tokens");
		System.out.println(t.countTokens());
		System.out.println(t.nextToken());
		System.out.println(t.nextToken());
		
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
		
		StringTokenizer t1 = new StringTokenizer("Edu-Bridge-India","-",true);
		while(t1.hasMoreTokens()) {
			System.out.println(t1.nextToken());
		}

	}

}
