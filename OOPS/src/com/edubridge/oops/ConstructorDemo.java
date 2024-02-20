package com.edubridge.oops;
class Area{
	int length ;
	int breadth ;
	int area;
	Area(int length,int breadth){
		this.length= length;
		this.breadth = breadth;
		
	}
	void printArea() {
		area = length*breadth;
		System.out.println("The area of Rectangle is:" + area);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Area(10,30);
		a.printArea();
		

	}

}
