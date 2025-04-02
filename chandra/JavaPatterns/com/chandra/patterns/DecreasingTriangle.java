package com.chandra.patterns;

import java.util.Scanner;

public class DecreasingTriangle {
	public void Traingle(int n) {
		for(int i =1; i <= n; i++) {
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
		DecreasingTriangle dt = new DecreasingTriangle();
		dt.Traingle(n);
		sc.close();
	}

}
