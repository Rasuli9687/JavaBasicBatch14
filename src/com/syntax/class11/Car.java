package com.syntax.class11;

public class Car {

	String color = "White";
	String make = "Tesla";
	String model = "S3";
	int year = 2018;
	int Hp = 300;

	void moveForward() {
		System.out.println("Moving forward.....");
	}

	void movebackwards() {
		System.out.println("Moving Backwards.....");
	}

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.moveForward();
		car1.movebackwards();

	}

}
