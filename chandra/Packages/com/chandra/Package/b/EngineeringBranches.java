package com.chandra.Package.b;
import com.chandra.Package.a.ArtificialIntelligence;
import com.chandra.Package.a.ComputerScience;
import com.chandra.Package.a.CyberSecurity;
public class EngineeringBranches {

	public static void main(String[] args) {
		
		ArtificialIntelligence ai = new ArtificialIntelligence();
		ComputerScience cse = new ComputerScience();
		CyberSecurity cs = new CyberSecurity();
		com.chandra.Package.a.DataScience ds = new com.chandra.Package.a.DataScience(); // Fully Qualified Name -- Another Way to import the class name
		ai.batchID();
		cse.batchID();
		cs.batchID();
		ds.batchID();
	}

}
