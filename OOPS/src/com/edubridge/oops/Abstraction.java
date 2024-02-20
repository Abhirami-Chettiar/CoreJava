package com.edubridge.oops;

/*Encapsulation
wrapping and binding of data in single unit
integrating variable and methods together

variables are hidden from other classes*/
class Whatsapp{
	private String personName;
	private String status;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Whatsapp w1=new Whatsapp();
		
		w1.setPersonName("Jhon");
		w1.setStatus("Life is race");
		
		System.out.println(w1.getPersonName()+" "+w1.getStatus());


	}

}
