package com.chandra.OOPs;

import java.util.Scanner;

class KalkiData {
	
	
	// Employee ID
	private int EmployeeID;
	
	public int getEmployeeID() { // getMethod or getter
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) { // setMEthod or setter
		EmployeeID = employeeID;
	}
	
	// Employee Salary
	private int EmpSalary;
	
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	
	// Permanent OTP
	private static String PermanentOTP;
	
	public static String getPermanentOTP() {
		return PermanentOTP;
	}
	public static void setPermanentOTP(String permanentOTP) {
		PermanentOTP = permanentOTP;
	}
	
	
	public String EmployeeName;
	public String DateOfJoin;
	
	
}

public class EncapsulationPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		KalkiData kd = new KalkiData();
		
		KalkiData.setPermanentOTP("211A0F");
		
		System.out.print("Enter Employee ID: ");
		kd.setEmployeeID(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Enter Employee Name: ");
		kd.EmployeeName = sc.nextLine();
		
		System.out.print("Enter Salary: ");
		kd.setEmpSalary(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Enter Date of Joined in \"Kalki\"(dd/mm/yyyy): ");
		kd.DateOfJoin = sc.nextLine();
		
		System.out.println();
		
		System.out.println("--- Employee Details ---");
		System.out.println("Employee ID: " + kd.getEmployeeID());
		System.out.println("Employee Name: " + kd.EmployeeName);
		System.out.println("Employee Salary Details: " + kd.getEmpSalary());
		System.out.println("Date Joined: " + kd.DateOfJoin);
		System.out.println("Secret OTP: " + KalkiData.getPermanentOTP());
		
		
		sc.close();
	}

}
