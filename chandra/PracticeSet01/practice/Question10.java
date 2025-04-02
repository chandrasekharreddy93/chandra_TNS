package practice;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Performing a Division Operation");
		System.out.print("Enter two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			double result = a / b;
			System.out.println("The divison of a and b is: " + result);
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("Divison Operation Ended");
		}
		sc.close();

	}

}
