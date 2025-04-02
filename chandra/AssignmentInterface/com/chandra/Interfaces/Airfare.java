package com.chandra.Interfaces;

import java.util.Scanner;

public interface Airfare {
	double calculateAmount(int hours, double costPerHour);
}

class AirIndia implements Airfare{
	private int hours;
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	private double costPerHour;
	AirIndia(){}
	AirIndia(int hours, double costPerHour){
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	
	public double calculateAmount(int hours, double costPerHour) {
		double totalFee = hours * costPerHour;
		return totalFee;	
	}
}

class KingFisher implements Airfare{
	private int hours;
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	private double costPerHour;
	KingFisher(){}
	KingFisher(int hours, double costPerHour){
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	
	public double calculateAmount(int hours, double costPerHour) {
		double totalFee = hours * costPerHour;
		return totalFee*4;
	}

}

class Indigo implements Airfare{
	int hours;
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	double costPerHour;
	Indigo(){}
	Indigo(int hours, double costPerHour){
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	
	public double calculateAmount(int hours, double costPerHour) {
		double totalFee = hours * costPerHour;
		return totalFee*8;
	}
}

class AirfareTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Choice(1-AirIndia, 2-KingFisher,  3-Indigo): ");
		int choice = sc.nextInt();
		System.out.print("Enter no of Hours: ");
		int hours = sc.nextInt();
		System.out.print("Enter costPerHour: ");
		double costPerHour = sc.nextDouble();
		
		Airfare airfare = null;
        
        if(choice == 1) {
        	airfare = new AirIndia(hours, costPerHour);
        }else if (choice == 2) {
        	airfare = new KingFisher(hours, costPerHour);
        }else if(choice == 3) {
        	airfare = new Indigo(hours, costPerHour);
        }else {
        	System.out.println("Invalid choice");
        	System.exit(0);
        }

        double totalFee = airfare.calculateAmount(hours, costPerHour);
        System.out.printf("Total Fee: %.2f" , totalFee);
        sc.close();
    }
}