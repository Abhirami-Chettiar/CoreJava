package com.edubridge.oopss;


interface i1{
	void show1();
	
	
}

interface i2{
	void show2();
	
}
//acheiving multiple inheritance 
interface i3  extends i1,i2{
	void show3();
	
}
class i4 implements i3{

	@Override
	public void show1() {
		System.out.println("This is show1 method");
		
	}

	@Override
	public void show2() {
		System.out.println("This is show2 method");
	}

	@Override
	public void show3() {
		System.out.println("This is show3 method");
	}
	
}
public class Test8 {

	public static void main(String[] args) {
		i4 i=new i4();
		i.show1();
		i.show2();
		i.show3();

	}

}
