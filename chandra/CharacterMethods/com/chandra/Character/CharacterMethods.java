package com.chandra.Character;

public class CharacterMethods {

	public static void main(String[] args) {
		char char1 = 'A';
		char char2 = 'a';
		char char3 = '0';
		char char4 = '9';
		char char5 = ' ';
		char char6 = '#';

		
		// 1. Character.isLetter(); --> returns boolean value
		System.out.println("Character.isLetter() method: ");
		System.out.println(Character.isLetter(char1));
		System.out.println(Character.isLetter(char2));
		System.out.println(Character.isLetter(char3));
		System.out.println(Character.isLetter(char4));
		
		// 2. Character.isDigit(); --> returns boolean value
		System.out.println("Character.isDigit() method: ");
		System.out.println(Character.isDigit(char1));
		System.out.println(Character.isDigit(char2));
		System.out.println(Character.isDigit(char3));
		System.out.println(Character.isDigit(char4));	
		
		
		// 3. Character.isWhitespace(); --> return boolean value
		System.out.println("Charcter.isWhitespace() method: ");
		System.out.println(Character.isWhitespace(char5));
		System.out.println(Character.isWhitespace(char6));
		
		// 4. Character.isUpperCase(); --> return boolean value
		System.out.println("Character.isUpperCase() method: ");
		System.out.println(Character.isUpperCase(char1));
		System.out.println(Character.isUpperCase(char2));
		
		// 5. Character.isLowerCase(); --> return boolean value
		System.out.println("Character.isLowerCase() method: ");
		System.out.println(Character.isLowerCase(char1));
		System.out.println(Character.isLowerCase(char2));
		
		// toLowerCase(), toUpperCase()
		System.out.print("To Upper case: ");
		System.out.println(Character.toUpperCase(char2));
		System.out.print("To Lower case: ");
		System.out.println(Character.toLowerCase(char1));
		
		// char --> String
		
		System.err.print("Character --> String: ");
		System.out.print(char6 + " --> " + Character.toString(char6));
	}

}
