/* Write a java program to  get all  your details  like your Full name with Initial,
   roll number, 
   Grade and percentage.
*/


package com.chandra.Assignments;

import java.util.Scanner;

public class ScannerClassAssignment {
	
	// Instance variables
	String fullName;
	int rollNumber;
	char grade;
	float percentage;
	
	// Instance Method
	void Details(String fullName, int rollNumber, char grade, float percentage) {
		this.fullName = fullName;
		this.rollNumber = rollNumber;
		this.grade  = grade;
		this.percentage = percentage;
	}
	
	public static void main(String[] args) {
		
		// Creating object for class
		
		ScannerClassAssignment a1 = new ScannerClassAssignment();
		
		// Taking user input:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Valid Details: ");
		
		System.out.print("Enter your Full Name: ");
		a1.fullName = sc.nextLine();
		
		System.out.print("Enter TNSIF Roll No (last 2 digits): ");
		a1.rollNumber = sc.nextInt();
		
		System.out.print("Enter your grade: ");
		a1.grade = sc.next().charAt(0);
		
		System.out.print("Enter academic percentage: ");
		a1.percentage = sc.nextFloat();
		
		// Method call
		
		a1.Details(a1.fullName, a1.rollNumber, a1.grade, a1.percentage);
		
		// Output:
		
		System.out.println("Name: " + a1.fullName);
		System.out.println("Roll no : T0201097" + a1.rollNumber);
		System.out.println("grade: " + a1.grade);
		System.out.println("percentage: " + a1.percentage + "%");
		sc.close();
	}

}
