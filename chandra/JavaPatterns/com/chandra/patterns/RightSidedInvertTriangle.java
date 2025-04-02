package com.chandra.patterns;

import java.util.Scanner;

public class RightSidedInvertTriangle {
	public void Triangle(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		RightSidedInvertTriangle rsit = new RightSidedInvertTriangle();
		rsit.Triangle(n);
		sc.close();
	}

}
