package com.chandra.OOPs.Inheritance;

class TemplesOfAP{
	void AndhraPradesh() {
		System.out.println("The Most Traditional and Ancient Temples of Andhra includes \"Thirumala\", \"Srisaialm\" , \"Kanaka Durgamma Temple\" and so on ");
	}
}

class ThirumalaTemple extends TemplesOfAP{
	void Thirumala() {
		System.out.println("Thirumala is in Tirupati, Andhra Pradesh");
	}
}

class SrisailamTemple extends TemplesOfAP{
	void Srisailam() {
		System.out.println("Srisailam is in Kurnool, Andhra Pradesh");
	}
}

class KanakaDurgammaTemple extends TemplesOfAP{
	void KanakaDurgamma() {
		System.out.println("Kanaka Durga Temple is in Indrakeeladri, Andhra Pradesh");
	}
}
public class HeiraricalInheritance {

	public static void main(String[] args) {
		ThirumalaTemple ttd = new ThirumalaTemple();
		System.out.println("Tirupati Details");
		ttd.AndhraPradesh();
		ttd.Thirumala();
		
		System.out.println();
		
		SrisailamTemple smd = new SrisailamTemple();
		System.out.println("Srisailam Details");
		smd.AndhraPradesh();
		smd.Srisailam();
		
		System.out.println();
		
		KanakaDurgammaTemple kdd = new KanakaDurgammaTemple();
		System.out.println("Kanaka Durgamma Temple Details");
		kdd.AndhraPradesh();
		kdd.KanakaDurgamma();
		
	}

}
