package practice;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Day Number: ");
		int dayNumber = sc.nextInt();
		String day = "";
		switch(dayNumber) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			System.out.println("Invalid Day Number!");
			System.exit(0);
		}
		System.out.println("The day for the day number " + dayNumber + " is: " + day);
		sc.close();

	}

}
