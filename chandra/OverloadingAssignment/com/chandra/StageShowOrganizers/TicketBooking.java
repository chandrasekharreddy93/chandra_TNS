package com.chandra.StageShowOrganizers;

import java.util.Scanner;

public class TicketBooking {
	
	// stage Event Attribute
	private String stageEvent;
	public String getStageEvent() {
		return stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	
	// customer Attribute
	private String customer;
	
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	// no of seats Attribute
	private int noOfSeats;
	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	// Parameterized Constructor
	TicketBooking(String stageEvent, String customer, int noOfSeats){
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	
	//Methods
	public void makePayment(Double amount) {
		System.out.println("Stage event: " + this.stageEvent);
		System.out.println("Customer: " + this.customer);
		System.out.println("Number of seats: " + this.noOfSeats);
		System.out.println("Amount " + amount + " paid in cash");
	}
	
	public void makePayment(String walletNumber, Double amount) {
		System.out.println("Stage event: " + this.stageEvent);
		System.out.println("Customer: " + this.customer);
		System.out.println("Number of seats: " + this.noOfSeats);
		System.out.println("Amount " + amount + " paid using wallet");
		System.out.println("number " + walletNumber);
	}
	
	public void makePayment(String creditCard, String cvv, String name, Double amount) {
		System.out.println("Stage event: " + this.stageEvent);
		System.out.println("Customer: " + this.customer);
		System.out.println("Number of seats: " + this.noOfSeats);
		System.out.println("Holder name: " + name);
		System.out.println("Amount " + amount + " paid using " + creditCard +"card");
		System.out.println("CVV: " + cvv);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Stage Event Name: ");
		String stageEvent = sc.nextLine();
		System.out.print("Enter Customer name: ");
		String customer = sc.nextLine();
		System.out.print("Number of seats: ");
		int noOfSeats = sc.nextInt();
		TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);
		System.out.print("Enter Payment Mode(1/2/3): ");
		int n = sc.nextInt();
		sc.nextLine();
		if(n == 1) {
			System.out.print("Enter amount: ");
			double amount = sc.nextDouble();
			tb.makePayment(amount);
		}else if(n == 2) {
			System.out.print("Enter amount: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter Wallet Number: ");
			String walletNum = sc.nextLine();
			tb.makePayment(walletNum, amount);
		}else if(n == 3) {
			System.out.print("Enter cardholder Name: ");
			String name = sc.nextLine();
			System.out.print("Enter amount: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter Credit card details: ");
			String creditCard = sc.nextLine();
			System.out.print("Enter CVV: ");
			String cvv = sc.nextLine();
			tb.makePayment(creditCard, cvv, name, amount);
		}else {
			System.out.println("Invalid choice");
		}
		
		sc.close();

	}

}

// Refer to Question, that is available in this Folder as Assignment_OverridingMethods.pdf