package com.chandra.ExceptionHandling;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

class InvalidAmountException extends Exception{
	public InvalidAmountException(String message) {
		super(message);
	}
}
public class BankAccount {
	
	int accountNumber;
	double balance;
	
	BankAccount(int accountNumber, double balance) throws InvalidAmountException{
		this.accountNumber = accountNumber;
		if(balance < 0) {
			throw new InvalidAmountException("Intial balance is Low");
		}
		this.balance = balance;
	}
	
	public void deposit(double amount) throws InvalidAmountException{
		if(amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be greater than zero.");
		}
		balance = balance + amount;
		System.out.println("Successfully deposited: ₹" + amount);
	}
	
	public void withdrawal(double amount) throws InvalidAmountException, InsufficientFundsException {
		if(amount <= 0) {
			throw new InvalidAmountException("Withdrawn amount must be greater than zero.");
		}
		if(amount > balance) {
			throw new InsufficientFundsException("Insufficient funds for the requested withdrawal.");
		}
		balance -= amount;
        System.out.println("Successfully withdrew: ₹" + amount);
	}
	
	public void displayBalance() {
		System.out.println("Current Balance: ₹" + balance);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter amount: ");
		double amount = sc.nextDouble();
		try {
			BankAccount ba = new BankAccount(accountNumber, amount);
			
			// Displaying the current balance
			ba.displayBalance();
			
			// Deposit some amount
			try {
				System.out.print("Enter the amount to be deposit: ");
				double depositAmount = sc.nextDouble();
				ba.deposit(depositAmount);
				ba.displayBalance();
			}catch (InvalidAmountException e) {
				System.out.println("Invalid! " + e.getMessage());
			}
			
			// Withdrawal some amount
			try {
				System.out.print("Enter the amount to be Withdraw: ");
				double withdrawAmount = sc.nextDouble();
				ba.withdrawal(withdrawAmount);
				ba.displayBalance();
			}catch (InvalidAmountException e) {
				System.out.println("Invalid! " + e.getMessage());
			}catch (InsufficientFundsException e) {
				System.out.println("Invalid! " + e.getMessage());
			}
		}catch (InvalidAmountException e){
			System.out.println("Error! " + e.getMessage());
		}finally {
			System.out.println("Banking Operation Completed!");
		}
		
		sc.close();
	}

}
