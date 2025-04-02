package javaBasics;

public class TypeCasting {
	// Default Size of Data Types in Java
	// Instance Variables
	byte b1;
	short s1;
	int i1;
	long l1;
	float f1;
	double d1;
	char c1;
	boolean bool1;
	
	public void defaultValues() {
		System.out.println("The Default size of BYTE is: " + b1);
		System.out.println("The Default size of SHORT is: " + s1);
		System.out.println("The Default size of INT is: " + i1);
		System.out.println("The Default size of LONG is: " + l1);
		System.out.println("The Default size of FLOAT is: " + f1);
		System.out.println("The Default size of DOUBLE is: " + d1);
		System.out.println("The Default size of CHAR is: " + c1);
		System.out.println("The Default size of BOOLEAN is: " + bool1);
	}
	
	
	public static void main(String[] args) {
		int i = 200;
		System.out.println("Size of Int (in bits) is: " + Integer.BYTES);
		System.out.println("Integer Value: " + i + "\n");
		// Type conversion into BYTE
		byte b = (byte) i;
		System.out.println("Size of Byte (in bits) is: " + Byte.SIZE/8);
		if(-128 <= b && b <= 127) {
			System.out.println("Overflow or Loss of Data");
		}else {
			System.out.println("No data Loss");
		}
		System.out.println("Byte Value: " + b + "\n");
		// Type conversion into SHORT
		short s = (short) i;
		System.out.println("Size of Short (in bits) is: " + Short.SIZE/8);
		System.out.println("Short Value: " + s + "\n");
		// Type conversion into LONG
		long l = (long) i;
		System.out.println("Size of Long (in bits) is: " + Long.BYTES);
		System.out.println("Long Value: " + l + "\n");
		// Time conversion into FLOAT
		float f = (float) i;
		System.out.println("Size of Float (in bits) is: " + Float.BYTES);
		System.out.println("Float Value: " + f + "\n");
		// Time conversion into Double
		double d = (double) i;
		System.out.println("Size of Double (in bits) is: " + Double.BYTES);
		System.out.println("Float Value: " + d + "\n");
		// Time conversion into Character
		char c = (char) i;
		System.out.println("Size of Char (in bits) is: " + Character.BYTES);
		System.out.println("Char Value: " + c + "\n");
		// Boolean Data type
		boolean bool = false;
		System.out.println("Boolean Value: " + bool);
	
		System.out.println("\n\n");
		
		System.out.println("The Various Min and Max Values of Data Types: ");
		System.out.println("Range of BYTE: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("Range of SHORT: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("Range of INT: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Range of LONG: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println("Range of FLOAT: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		System.out.println("Range of DOUBLE: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		
		System.out.println("\n\n");
		
		// Default Values of Datatypes 
		// Creating an object for Instance Variables
		TypeCasting obj = new TypeCasting();
		// Method Calling
		obj.defaultValues();
	}

}
