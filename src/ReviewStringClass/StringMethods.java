package ReviewStringClass;

public class StringMethods {

	public static void main(String[] args) {
		
		
	String str="hello";
	
	// to UpperCase or to lower case
	str.toUpperCase();
	System.out.println(str);//hello
	
	System.out.println("____________________________");
	
	str=str.toUpperCase();
	System.out.println(str);//HELLO
	
	//Length() -> gives size
	int size=str.length();
	System.out.println(size);
	
	//chartAt () -> returns the char value at the specified index
	char letter=str.charAt(0);
	System.out.println(letter);//4
	
	//how to get last Character
	str.charAt(str.length()-1);
	char lastCharacter=str.charAt(str.length()-1);
	System.out.println(lastCharacter);//0
	
	//indexOf - Returns the index within this string of the first occurrens
	int index=str.indexOf(lastCharacter);
	System.out.println(index);//4
	
	System.out.println(str.indexOf('e'));//-1
	
	//isEmpty() -> returns true if lenght is more than 0
	boolean empty=str.isEmpty();
	System.out.println(empty);
	
	//trim();
	

	}

}
