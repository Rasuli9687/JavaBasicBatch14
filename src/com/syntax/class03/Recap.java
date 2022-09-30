package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		/*
		 * String concatenation helps us combine a String with any primitive data type
		 * together we can a
		 * 
		 */
		String firstName = "Fraidoon";
		String lastName = "Rasuli";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		int houseNo = 2830;
		
		String streetName = "Amalfi way";
		String city = "Lawrenceville";
		String country = "USA";
		String state = "Gerogia";
		int zipcode = 30044;
		String fullAddress = houseNo + " " + streetName + " " + city + " " + state + " " + zipcode + " " + country;
		System.out.println(fullAddress);
		String incompleteAddress = houseNo + city;
		String step1 = "if we subtract 10 from 5 we get =" + 10; // results in a String
		System.out.println(step1);
		// its is not defined java does not understand what to do when we ask her to
		// subtract
		// a String from sa number it complains
		// String step2=step1-5;
		System.out.println("if we subtract 10 from 5 we get = " + (10 - 5));
	}
}