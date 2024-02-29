package com.edubridge.problemsii;

public class ChildClass implements Child{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass child1 = new ChildClass();
		child1.eyes();
		child1.career();
		child1.hair();
		child1.height();
		child1.hobby();
		child1.nose();
		child1.skintone();
	}

	@Override
	public void hair() {
		// TODO Auto-generated method stub
		System.out.println("Hair Type : Curly hair");
		
	}

	@Override
	public void eyes() {
		// TODO Auto-generated method stub
		System.out.println("Eyes : Blue lens");
		
	}

	@Override
	public void nose() {
		// TODO Auto-generated method stub
		System.out.println("Nose : Peak nose");
		
	}

	@Override
	public void height() {
		// TODO Auto-generated method stub
		System.out.println("Height: 140cm");
		
	}

	@Override
	public void skintone() {
		// TODO Auto-generated method stub
		System.out.println("Skin Tone: Dusky ");
		
	}

	@Override
	public void hobby() {
		// TODO Auto-generated method stub
		System.out.println("Hobby : Reading Books");
		
	}

	@Override
	public void marriage() {
		// TODO Auto-generated method stub
		System.out.println("Marry xyz");
		
	}

	@Override
	public void career() {
		// TODO Auto-generated method stub
		System.out.println("Job : Developer");
		
	}
		

}
