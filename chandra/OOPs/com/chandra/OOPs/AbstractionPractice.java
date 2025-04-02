package com.chandra.OOPs;

import java.util.Scanner;

abstract class RealmeUpdates{
	
	String patchName;
	public String getPatchName() {
		return patchName;
	}

	public void setPatchName(String patchName) {
		this.patchName = patchName;
	}
	
	String patchMonth;
	public String getPatchMonth() {
		return patchMonth;
	}

	public void setPatchMonth(String patchMonth) {
		this.patchMonth = patchMonth;
	}
	
	public abstract String patchDetail();
}

class MonthlyUpdate extends RealmeUpdates {

	@Override
	public String patchDetail() {
		return "Security Patch Update for - " + getPatchMonth();
	}
	
}
public class AbstractionPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RealmeUpdates ui = new MonthlyUpdate();
		
		System.out.print("Enter Patch name(title): ");
		ui.setPatchName(sc.nextLine());
		
		System.out.print("Enter Patch Month(eg: jan): ");
		ui.setPatchMonth(sc.nextLine());
		
		System.out.println("--- Realme Patch Updates List (2024 Q1) ---");
		System.out.println("Patch-Update Name: " + ui.getPatchName());
		System.out.println("Patch Month: " + ui.getPatchMonth());
		sc.close();
		
	}

}
