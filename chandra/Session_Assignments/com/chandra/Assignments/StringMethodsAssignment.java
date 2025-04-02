package com.chandra.Assignments;

import java.util.Scanner;

public class StringMethodsAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String lowerWord = "";
		String upperWord = "";
		for(int i = 0; i < word.length(); i++) {
			if(Character.isLowerCase(word.charAt(i))) {
				lowerWord += word.charAt(i);
			}else {
				upperWord += word.charAt(i);
			}
		}
		String modifiedWord = lowerWord + upperWord;
		System.out.println(modifiedWord);
		sc.close();

	}

}
