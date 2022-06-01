package com.multilevel_inheritance;

public class GrandChild_Class extends Child_Class{

	private void sports() {

		System.out.println("I am a Cricketer!...");
		
	}
	
	public static void main(String[] args) {
		
		GrandChild_Class grand = new GrandChild_Class();
		
		grand.sports();
		
		grand.dancing();
		
		grand.singing();
		
	}
	
	
}
