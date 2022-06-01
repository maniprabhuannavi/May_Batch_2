package com.hier_inherit;

public class Class_B extends Class_A{

	public void chennai() {

		System.out.println("Welcome to Chennai....");
		
	}
	public static void main(String[] args) {
		
		Class_B b = new Class_B();
		
		b.tamilnadu();
		
		b.chennai();
	}
	
}
