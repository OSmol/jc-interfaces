package edu.examples.java_classes.ingredients;

import edu.examples.java_classes.ingredients.Vanilla.KindOfVanillin;

public class Vanilla extends Ingredient implements Bakinable {
	private KindOfVanillin kindOfVanillin;
	
	
	enum KindOfVanillin{
		CRYSTALS, WATER_SOLUTION, OIL_SOLUTION;		
	}


	@Override
	public boolean isHeatTreatmentAllowed() {
		return true;
	}

}
