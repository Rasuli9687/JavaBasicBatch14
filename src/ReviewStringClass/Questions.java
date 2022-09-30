package ReviewStringClass;

public class Questions {

	public static void main(String[] args) {
		// how would you reverse a string without usig reverse function
		/*1. use StringBuilder and recerse method
		 * 2. use charAt();
		 * 3.
		 */
		
		
		String str="hello";
		String newString="";
		
		for (int i=str.length()-1; i>=0;i--) {
			newString=newString+str.charAt(i);
			
			
		}
		StringBuilder sb=new StringBuilder ("Class is almost over");
		sb.reverse();
		System.out.println(sb);
	}

}
