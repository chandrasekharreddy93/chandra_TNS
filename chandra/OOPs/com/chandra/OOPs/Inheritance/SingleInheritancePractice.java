package com.chandra.OOPs.Inheritance;

class Iphone14Plus {
	
	void Iphone14PlusSpecs() {
		System.out.println("Display: Super Retina XDR Display");
		System.out.println("Processor: A15 Bionic Chip");
		System.out.println("Rear Camera: 12MP + 12 MP");
		System.out.println("Front Camera: 12MP");
		System.out.println("Battery: 4323 mAh");
	}
	
}

class Iphone14Pro extends Iphone14Plus {
	
	void Iphone14ProSpecs() {
		System.out.println("Processor: A16 Bionic Chip");
		System.out.println("Battery: 3200 mAh");
	}
}
public class SingleInheritancePractice {

	public static void main(String[] args) {
		Iphone14Pro apple = new Iphone14Pro();
		System.out.println("+++ Iphone 14 Plus Specifications +++");
		apple.Iphone14PlusSpecs();
		
		System.out.println("+++ Iphone 14 Pro Specifications +++");
		apple.Iphone14ProSpecs();
		
	}

}

// Need Improvement in this in later Topics using @override, super keyword.