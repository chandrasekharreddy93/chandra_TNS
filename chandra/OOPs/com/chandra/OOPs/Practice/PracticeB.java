package com.chandra.OOPs.Practice;

import java.util.Scanner;

class Account {
    private int accountNumber;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getInfo(int accountNumber, int balance) {
        return "Account Details: Account Number: " + accountNumber + ", " + "Balance: " + balance;
    }
}

class SavingsAccount extends Account {
    private float interestRate;

    public float getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    public String getInfo(int accountNumber, int balance, float interestRate) {
        return "Account Details: Account Number: " + accountNumber + ", " + "Balance: " + balance + ", " + "Interest Rate: " + interestRate;
    }
}

class CurrentAccount extends Account {
    private int overDraftLimit;

    public int getOverDraftLimit() {
        return overDraftLimit;
    }
    public void setOverDraftLimit(int overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    public String getInfo(int accountNumber, int balance, int overDraftLimit) {
        return "Account Details: Account Number: " + accountNumber + ", " + "Balance: " + balance + ", " + "Overdraft Limit: " + overDraftLimit;
    }
}

public class PracticeB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String account = sc.nextLine().toLowerCase();

        switch (account) {
            case "savingsaccount":
                String[] savingsInput = sc.nextLine().split(",");
                int accountNumber = Integer.parseInt(savingsInput[0].trim());
                int balance = Integer.parseInt(savingsInput[1].trim());
                float interestRate = Float.parseFloat(savingsInput[2].trim());
                SavingsAccount sa = new SavingsAccount();
                sa.setAccountNumber(accountNumber);
                sa.setBalance(balance);
                sa.setInterestRate(interestRate);
                System.out.println(sa.getInfo(accountNumber, balance, interestRate));
                break;
            case "currentaccount":
                String[] currentInput = sc.nextLine().split(",");
                int accountNumber1 = Integer.parseInt(currentInput[0].trim());
                int balance1 = Integer.parseInt(currentInput[1].trim());
                int overDraftLimit = Integer.parseInt(currentInput[2].trim());
                CurrentAccount ca = new CurrentAccount();
                ca.setAccountNumber(accountNumber1);
                ca.setBalance(balance1);
                ca.setOverDraftLimit(overDraftLimit);
                System.out.println(ca.getInfo(accountNumber1, balance1, overDraftLimit));
                break;
            default:
                System.out.println("Unknown account type.");
                break;
        }

        sc.close();
    }
}
