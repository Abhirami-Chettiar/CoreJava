package com.edubridge.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//Program to demonstrate on LocalDate ,LocalDateTime , LocalTime
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println("The current Date is : "+d);
		
		
		LocalTime t = LocalTime.now();
		System.out.println("The current time is : "+t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("The current Date and time is : "+dt);

	}

}
