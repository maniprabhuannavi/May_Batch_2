package com.multilevel_inheritance;

public class Child_Class extends Parent_Class{

	public void dancing() {

		System.out.println("I am a Dancer!....");
		
	}
	
	public static void main(String[] args) {
		
		Child_Class child = new Child_Class();
		
		child.singing();
		
		child.dancing();
		
	}
	
	
}
