package com.chandra.OOPs.Practice;

import java.util.Scanner;

class Vehicle{
	private String brand;
	private String model;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getInfo(String brand, String model) {
		return "Vehicle info: Brand: " + brand + " " + "Model: " + model;
		
	}
}

class Car extends Vehicle {
	private int seats;
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getInfo(String brand, String model, int seats) {
		return "Vehicle info: Brand: " + brand + ", " + "Model: " + model + ", " + "Seats: " + seats;
	}
}

class Bike extends Vehicle {
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInfo(String brand, String model, String type) {
		return "Vehicle info: Brand: " + brand + ", " + "Model: " + model + ", " + "Type: " + type;
	}
}
public class PracticeA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter vehicle: ");
		String vehicle = sc.nextLine().toLowerCase();
		switch(vehicle) {
		case "car":
			String brand = sc.nextLine();
			String model = sc.nextLine();
			int seats = sc.nextInt();
			Car c = new Car();
			System.out.println(c.getInfo(brand, model, seats));
			break;
		case "bike":
			String brand1 = sc.nextLine();
			String model1 = sc.nextLine();
			String type = sc.nextLine();
			Bike b = new Bike();
			System.out.println(b.getInfo(brand1, model1, type));
			break;
		}
		

		sc.close();
		
	}

}
