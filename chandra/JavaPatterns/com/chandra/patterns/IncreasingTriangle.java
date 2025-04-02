package com.chandra.patterns;

import java.util.Scanner;

public class IncreasingTriangle {
	public void Triangle(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		IncreasingTriangle it = new IncreasingTriangle();
		it.Triangle(n);
		sc.close();
	}

}
