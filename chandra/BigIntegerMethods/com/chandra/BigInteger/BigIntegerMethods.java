package com.chandra.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "92346809213582074027108305705720817349580101";
		BigInteger bigNum = new BigInteger(str); // BigInteger objname = new BigInteger from java.math.BigInteger class
		System.out.println(bigNum);
		String str1 = "6578929102739729743628372983";
		BigInteger b1 = new BigInteger(str1);
		String str2 = "9237469170147104874047060640";
		BigInteger b2 = new BigInteger(str2);
		
		// BigInteger Methods:
		// 1. add():
		System.out.println("Addition is: " + b1.add(b2));
		// 2. subtract():
		System.out.println("Subtraction is: " + b1.subtract(b2));
		// 3. multiply():
		System.out.println("Multiplication is: " + b1.multiply(b2));
		// 4. divide():
		System.out.println("Divison is: " + b2.divide(b1)); // quotient
		// 5. pow()
		BigInteger bignum1 = new BigInteger("-265245244315345");
		System.out.println("Power value: " + bignum1.pow(2));
		// 6. abs()
		System.out.println("Absolute value: " + bignum1.abs());
		
		// Converting BigInteger to int, long, float, double or string:
		
		String bigNumber = "8632451";
		BigInteger bin = new BigInteger(bigNumber);
		// BigInt --> int
		int i = bin.intValue();
		// BigInt --> int
		long l = bin.longValue();
		// BigInt --> float
		float f = bin.floatValue();
		// BigInt --> double
		double d = bin.doubleValue();
		// BigInt --> String
		String s = bin.toString();
		// BigInt --> byte
		byte b = bin.byteValue();
		
		System.out.println("BigInt --> int: " + i);
		System.out.println("BigInt --> long: " + l);
		System.out.println("BigInt --> float: " + f);
		System.out.println("BigInt --> double: " + d);
		System.out.println("BigInt --> String: " + s);
		System.out.println("BigInt --> byte: " + b);
		
		sc.close();
		
	}

}
