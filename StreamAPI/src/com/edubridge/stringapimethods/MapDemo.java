package com.edubridge.stringapimethods;

import java.util.Arrays;
import java.util.List;
// Program to demonstrate on map
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj = Arrays.asList("Tom&Jerry","Oggy & the Coackroches","Oswald","Doremon");
		obj.stream().map(i->i.length()).forEach(i->System.out.println(i));

	}

}
