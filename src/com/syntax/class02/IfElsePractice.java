package com.syntax.class02;

public class IfElsePractice {

	public static void main(String[] args) {

		int club = 20;
		if (club > 21) {
			System.out.println("you cant go club");
		}
		if (club == 21) {
			System.out.println("you can go club");
		}

		else if (club > 21) {
			System.out.println("rasuli should stay at home and study like man");
		}

		int number = 20;

		if (number < 20) {
			System.out.println("if number is greater than 20 print this");
		} else if (number == 20) {
			System.out.println("if its equal i will go to school");
		} else {
			System.out.println("number is not vaild");
		}
	}

}
