package com.chandra.patterns;

import java.util.Scanner;

public class SquarePattern {
	public void Square(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		SquarePattern sp = new SquarePattern();
		sp.Square(num);
		sc.close();
	}

}
