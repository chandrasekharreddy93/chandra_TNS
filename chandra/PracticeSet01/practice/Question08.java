package practice;

class Car{
	// instance variables
	String model = "Tata Tiago";
	double price = 750000.00;
	
	// constructor
	Car(){
		System.out.println("Car Model: " + model);
		System.out.println("Car Price: " + price);
		
	}
}

public class Question08 {
	public static void main(String[] args) {
		Car car = new Car();
	}

}
