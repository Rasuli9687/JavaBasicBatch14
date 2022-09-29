package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * logical and ture && true t true && false f false&& false f false&&false f
		 * 
		 */

		boolean understandJava = true;
		boolean enjoyJava = false;
		boolean practice = true;

		if (understandJava && enjoyJava && practice)
			;
		{
			System.out.println("this is awesome");
		}
		System.out.println(" another example ");

		int n1 = 100;
		int n2 = 200;
		int n3 = 300;

		if (n1 > n2 && n1 > n3) {

			System.out.println(n1 + " is the largest");
		}

		else if (n2 > n3 && n2 > n1) {

			{
				System.out.println(n2 > n3 && n2 > n1);
			}
		}

	}

}
