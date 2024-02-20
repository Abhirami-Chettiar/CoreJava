package com.edubridge.stringapimethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> obj = Arrays.asList("","Abhi","","Saniya","","","hello","Mental Mania","");
		List<String> res = obj.stream().filter(i->!i.isEmpty()).collect(Collectors.toList());
		System.out.println(res);
		List<String> obj1 = Arrays.asList("Abhi","Saniya","hello","Mental Mania");
		String res1 = obj1.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(res1);

	}

}
