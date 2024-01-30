package com.edubridge.enumeration;

public enum Day {

	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4)
	,FRIDAY(5),SATURDAY(6);
	private int i;
	
Day(int j) {
		// TODO Auto-generated constructor stub
	i = j;
}
int displayIndex() {
	return i;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(Day.SATURDAY);
	System.out.println(Day.MONDAY.displayIndex());
	

}
}
