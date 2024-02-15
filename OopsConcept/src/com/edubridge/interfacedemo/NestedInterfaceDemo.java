package com.edubridge.interfacedemo;
import com.edubridge.interfacedemo.Books.StoryBooks;
public class NestedInterfaceDemo implements Books,StoryBooks{
	@Override
	public void ShowBooks() {
		// TODO Auto-generated method stub
		System.out.println("The girl in Room 105");
		
	}

	@Override
	public void ShowStoryBooks() {
		// TODO Auto-generated method stub
		System.out.println("Harry Potter - The Goblet of Fire");
		
	}

}
