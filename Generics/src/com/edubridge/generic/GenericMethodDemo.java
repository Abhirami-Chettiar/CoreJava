package com.edubridge.generic;

public class GenericMethodDemo {
	public  <E> void  accept(E[] arr){
		for(E itr: arr) {
			System.out.print(itr +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] ch = {'a','e','i','o','u'};
		Integer[] prime = {0,1,1,2,3,5,8,13,21};
		GenericMethodDemo d1 = new GenericMethodDemo();
		d1.accept(ch);
		d1.accept(prime);
	}

}
