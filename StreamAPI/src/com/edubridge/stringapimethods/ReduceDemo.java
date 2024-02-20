package com.edubridge.stringapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj = Arrays.asList(4,56,7,889,32,5,6,75);
		Optional<Integer> res = obj.stream().reduce((a,b)->a*b);
		if(res.isPresent())
			System.out.println(res.get());
		else
			System.out.println("Not Present");

	}

}
