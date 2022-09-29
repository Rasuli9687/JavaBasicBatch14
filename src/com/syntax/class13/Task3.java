package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		String str = " Today is Sunday";
		char[] ch = str.toCharArray();
		String reve = " ";
		for (int i = ch.length - 1; i > 0; i--) {
			reve += ch[i];
			System.out.print(ch[i]);
		}

	}

}
