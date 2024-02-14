package com.edubridge.generic;

class Citizen<A,T,K>{
	A a;
	T t;
	K k;
	void print(A a, T t, K k) {
		this.a = a;
		this.t = t;
		this.k = k;
		System.out.println(this.a+" "+this.t+" "+this.k);
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen<String,Integer,String> citizen = new Citizen<>();
		citizen.print("Mumbai", 22, "Indian");

	}

}
