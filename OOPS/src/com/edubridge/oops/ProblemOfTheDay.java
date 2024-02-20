package com.edubridge.oops;
//Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
class Shape1{
	void printShape() {
		System.out.println("This is Shape");
		
	}
}
class Rectangle1 extends Shape1 {
	void printRect() {
		System.out.println("This is Rectangle");
		
	}
	
}
class Square1 extends Rectangle1{
	void printSquare() {
		System.out.println("This is Square");
		
	}
}
class Circle1 extends Shape1{
	void printCircle() {
		System.out.println("This is Circle");
		
	}
	
}

public class ProblemOfTheDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square1 sq = new Square1();
		sq.printShape();
		sq.printRect();
	}

}
