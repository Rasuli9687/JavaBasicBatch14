package harrisonspractice;

import java.util.Scanner;

public class assignment37 {

	public static String responsibility;
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter name of the insturctor");
		 String name = scan.nextLine();
		  
		  String responsibility;
		  
		  switch (name) {
		    case "Asghar": 
		    responsibility = "Will take care of Java Assignment";
		    break;
		    
		    case "Moazzam": 
		    responsibility = "Will take care of SDLC Assignment";
		    break;

		    case "Weqas": 
		    responsibility = "Will take care of Selenium   Assignment";
		    break;

		     case "Asel":
		    responsibility = "Will take care of every Assignment";
		    break;

		    default:
		    responsibility = "Invalid instructor selected";
		    break;
		    }
		  
		  System.out.println(name);
	}

}
