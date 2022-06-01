package com.java_intro;

public class Data_Types {

	private void firstMethod() {
		
		System.out.println("I am a Method");

	}
	
	
	public static void main(String[] args) {
		
		byte firstVariable = 0;
		
		int secondVariable = 200;
		
		float thirdVariable = 20.5f;
		
		
		short fourthVariable = 12;
		
		char fifthVariable = 'A';
		
		System.out.print(fifthVariable+", "+secondVariable+", " +fourthVariable);
		
		System.out.println(firstVariable);
		
		
		//OBJECT CREATON
		
		Data_Types objectName = new Data_Types();
		
		objectName.firstMethod();
		
	}
	
	


	
}
