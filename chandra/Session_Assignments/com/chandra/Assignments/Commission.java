/* Define a class Commission described as follows:
 Data Members: Name, Address, Phone, Sales_amount 
 Member methods:
 (i) To accept details of the sales employee
 (ii) to calculate the commission as follows: 
 Sales_amount >= 100000, commission = 10%; 
 50000 <= Sales_amount < 100000, commission = 5%; 
 30000 <= Sales_amount < 50000, commission = 3%; 
 Sales_amount < 30000, no commission.
*/

package com.chandra.Assignments;

import java.util.Scanner;

public class Commission {
	
	// Data members: variables/attributes
	String name;
	String address;
	long phone;
	double salesAmount;
	
	// Methods
	void salesEmployeeDetails(String name, String address, long phone, double salesAmount) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.salesAmount = salesAmount;
	}
	
	// Method for calculating commissions
	double totalCommission(double salesAmount) {
		double commission = 0.0;
		if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000 && salesAmount < 100000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0.0;
        }
		return commission;
	}
	
	public static void main(String[] args) {
		Commission c = new Commission();
		
		// Taking user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		c.name = sc.nextLine();
		
		System.out.print("Enter address: ");
		c.address = sc.nextLine();
		
		System.out.print("Enter phone: ");
		c.phone = sc.nextLong();
		
		System.out.print("Enter sales amount: ");
		c.salesAmount = sc.nextDouble();
		
		// Calling method
		c.salesEmployeeDetails(c.name, c.address, c.phone, c.salesAmount);
		
		// Output:
		System.out.println("Employee name: " + c.name);
		System.out.println("Address: " + c.address);
		System.out.println("Phone number: " + c.phone);
		System.out.println("Your Commission for " + c.salesAmount + " is: " + c.totalCommission(c.salesAmount));
		sc.close();
	}

}
