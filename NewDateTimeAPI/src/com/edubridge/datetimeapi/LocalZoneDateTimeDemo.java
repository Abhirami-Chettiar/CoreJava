package com.edubridge.datetimeapi;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalZoneDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		OffsetTime o = OffsetTime.now();
		System.out.println(o);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		ZoneId i = ZoneId.of("Asia/Calcutta");
		System.out.println(i);
		
		ZoneOffset zo = ZoneOffset.UTC;
		System.out.println(zo);

		ZoneOffset z1 = ZoneOffset.ofHoursMinutes(5, 45);
		System.out.println(z1);
		
//		String ourDate = "2020-12-04 07:30";
//		DateTimeFormatter tr = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM");
//		
		LocalDateTime t1 = LocalDateTime.parse(ourDate,tr);
		System.out.println(t1);
		
		
	}

}
