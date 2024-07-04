package edu.examples.java_classes.main;

import java.util.ArrayList;
import java.util.List;

import edu.examples.java_classes.ingredients.Bakinable;
import edu.examples.java_classes.ingredients.Saladable;
import edu.examples.java_classes.ingredients.Sugar;
import edu.examples.java_classes.ingredients.Vanilla;

public class Main {

	public static void main(String[] args) {
		Bakinable ingr1;
		
		//ingr1 = new Bakinable();
		ingr1 = new Sugar("Cane Sugar", 99.9);
		ingr1 = new Vanilla("Vanilla lujae De Wild", Vanilla.KindOfVanillin.CRYSTALS);
		
		System.out.println(ingr1.isHeatTreatmentAllowed());
		
	}
}
