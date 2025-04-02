package com.chandra.Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String firstName = "Shiva Pulla Reddy ";
		String lastName = "Sareddy";
		
		// 1. Concatenation:
		String concat1 = firstName + lastName;
		System.out.println("Concat Method 1: " + concat1);
		
		String concat2 = firstName.concat(lastName);
		System.out.println("Concat Method 2: " + concat2);
		
		// 2. Length of a String
		
		int firstNameLen = firstName.length();
		System.out.println("Length of First name: " + firstNameLen);
		
		// 3. String index character
		
		char lastNameThirdLetter = lastName.charAt(2);
		System.out.println("Last name third letter: " + lastNameThirdLetter);
		
		// 4. String slicing- part of the string
		
		String partOfString = firstName.substring(0, 6);
		System.out.println("Part of String: " + partOfString);
		
		
		// 5. String repetition
		
		String repeated = lastName.repeat(3);
		System.out.println("Repated string: " + repeated);
		
		String word = "   Artificial Intelligence  ";
		
		// 6. trim()
		
		String newWord = word.trim();
		System.out.println(newWord);
		
		// 7. toLowerCase();
		
		String lowerStr = firstName.toLowerCase();
		System.out.println("in lower case: " + lowerStr);
		
		// 8. toUpperCase();
		
		String upperStr = firstName.toUpperCase();
		System.out.println("IN UPPER CASE: " + upperStr);
		
		// 9. startsWith();
		
		boolean isStart = firstName.startsWith("Shiva");
		System.out.println("true or false: " + isStart);
		
		// 9. endsWith();
		
		boolean isEnd = lastName.startsWith("Sareddy");
		System.out.println("true or false: " + isEnd);
		
		// 10. replace();
		
		String newString = firstName.replace("Pulla", "Shankar");
		System.out.println("Replace all Occurences: " + newString);
		
		// 11. replaceFirst();
		
		String newWord1 = word.replaceFirst("Art", "Smart");
		System.out.println("Replace first occurence: " + newWord1);
		
		// 12. split();
		
		String[] wordArr = firstName.split(" ");
		System.out.println("Array of words: " + Arrays.toString(wordArr));
		
		
		String lang = "Java";
		String inventer = "James Gosling";
		
		// 13. join();
		
		String newForm = String.join("-", lang, inventer); // 3 args
		System.out.println("Join(): " + newForm);
		
		// 14. equals();
		
		boolean isEqual = ("Java".equals("Java"));
		System.out.println(isEqual);
		
		// 15. equalsIgnoreCase();
		
		boolean isEqualsIgnore = ("Java".equalsIgnoreCase("java"));
		System.out.println(isEqualsIgnore);
		
		// 16. compareTo();
		
		int isCompareTo = ("Java".compareTo("Java"));
		System.out.println(isCompareTo);
		
		// 16. compareTo();
		
		int isCompareToIgnore = ("Java".compareToIgnoreCase("java"));
		System.out.println(isCompareToIgnore);
		
		// 17. toCharArray();
		
		char[] arrChar = lang.toCharArray();
		System.out.println(Arrays.toString(arrChar));
		
		// 18. indexOf();
		
		int index = lang.indexOf("v");
		System.out.println("Index of 2 is: " + index);
		
		// 19. contains();
		
		boolean isContain = word.contains("Intelligence");
		System.out.println("true or false: " + isContain);
		
		// 20. getBytes();
		
		byte[] bytes = lang.getBytes();
		System.out.println(Arrays.toString(bytes));
	}

}
