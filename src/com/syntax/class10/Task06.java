package com.syntax.class10;

public class Task06 {

	public static void main(String[] args) {
	
		// write a program to swap 2 numbers without a temporary variable?
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
