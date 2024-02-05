package com.edubridge.thiskeyword;
/* It can be used to refer instance variable of current class*/
class Account{
	public String accType;
	public long accno;
	
	public void setData(String accType,long accno) {
		this.accType = accType;
		this.accno = accno;
	}
	
	public void display() {
		System.out.println("Account Type : "+accType+"\nAccount Number : "+ accno);
	}
}
public class ThisKeywordDemoOne {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setData("Salary", 542311898);
		ac.display();
	}

}
