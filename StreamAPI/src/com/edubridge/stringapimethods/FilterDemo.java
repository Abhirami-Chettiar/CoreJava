package com.edubridge.stringapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String[] args) {
		List<String> obj = Arrays.asList("Tom&Jerry","Oggy & the Coackroches","Oswald","Doremon");
		obj.stream().filter(i->i.length()>5).forEach(i->System.out.println(i));
		
		
		
		Stream<Integer> obj1 = Stream.of(11,22,33,44,55,66,7,4,3,23,21);
		System.out.println(obj1.count());
		
		obj.stream().limit(3).forEach(i->System.out.print(i+" , "));
		System.out.println("");
		obj.stream().skip(1).forEach(i->System.out.println(i));
		
	}

}

