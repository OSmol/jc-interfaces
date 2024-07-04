package edu.examples.java_classes.ingredients;

public class Vanilla extends Ingredient{//is-a
	private KindOfVanillin kindOfVanillin;
	
	
	public enum KindOfVanillin{
		CRYSTALS, WATER_SOLUTION, OIL_SOLUTION;		
	}
}
