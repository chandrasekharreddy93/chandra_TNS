package com.chandra.OOPs.Inheritance;

class Baahubali1 {
	void BaahubaliTheBeginning() { // Parent
		System.out.println("Prabhas as: Mahendra Baahubali");
	}
}

class Baahubali2 extends Baahubali1 {
	void BaahubaliTheMiddle() {
		System.out.println("Prabhas as: Amarendra Baahubali");
	}
}

class Baahubali3 extends Baahubali2 {
	void BaahubaliTheConclusion() {
		System.out.println("Prabhas as: Surendra Baahubali");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Baahubali3 baahubali = new Baahubali3();
		
		System.out.println("The First Emperor: ");
		baahubali.BaahubaliTheBeginning();
		System.out.println();
		
		System.out.println("The Second Emperor: ");
		baahubali.BaahubaliTheMiddle();
		System.out.println();
		
		System.out.println("The Third Emperor: ");
		baahubali.BaahubaliTheConclusion();
		System.out.println();
	}

}
