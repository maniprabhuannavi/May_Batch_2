package com.polymorphism;

public class Method_Overloading_Class {

	public void sum(int a, int b) {

		System.out.println(a + b);

	}

	public void sum(int x, byte y) {

		System.out.println("Int and Byte....");
		
	}

	public void sum(byte y, int x) {

		System.out.println("Byte and Int...");
		
	}
	
	
	private void sum() {

		int k = 22;
		
		int l = 44;
		
		int m = 55;
		
		System.out.println(k+l+m);
		
	}
	
	
	public static void main(String[] args) {

		Method_Overloading_Class m = new Method_Overloading_Class();
		
		m.sum(10, 90);
		
		m.sum(0, 0);
		
		m.sum(1, 1);
		
		//m.sum();
		
	}

}
