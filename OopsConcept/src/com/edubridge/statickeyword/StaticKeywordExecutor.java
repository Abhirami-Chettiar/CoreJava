package com.edubridge.statickeyword;
class LearnerDetails{
	String name;
	int rollno;
	static String instituteName ="Edubridge";
	/*3 . If any method is non-static and we want to access*/
	LearnerDetails(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	public void display() {
		System.out.println(name+" "+rollno+" "+LearnerDetails.instituteName);
	}
}

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnerDetails l1 = new LearnerDetails("Abhirami",202);
		l1.display();

	}

}
