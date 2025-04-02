package javaBasics;

public class TypesVariables {
	// Instance Variables
	int age;
	int passOutYear;
	//Static variable
	static String branch = "CSE";
	
	public void studentDetails(){
		//local Variables
		int studentID = 1023;
		double gradePoints = 9.25;
		String studentName = "Shiva Sareddy";
		System.out.println("The Student Details: \n\n" + "Student Roll Number: " + studentID + "\nStudent Name: " + studentName + "\nAge: " + age + "\nBranch: " + branch + "\nStudent grade points: " + gradePoints + "\nPass out year: "+ passOutYear);
	}

	public static void main(String[] args) {
		// Local variables
		TypesVariables obj = new TypesVariables();
		obj.age = 21;
		obj.passOutYear = 2025;
		obj.studentDetails();
	}

}
