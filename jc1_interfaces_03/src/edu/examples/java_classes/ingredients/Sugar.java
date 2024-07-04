package edu.examples.java_classes.ingredients;

public class Sugar extends Ingredient implements Bakinable {
	private double massFractionSucrose; // массовая доля сахарозы

	@Override
	public boolean isHeatTreatmentAllowed() {
		return true;
	}
}
