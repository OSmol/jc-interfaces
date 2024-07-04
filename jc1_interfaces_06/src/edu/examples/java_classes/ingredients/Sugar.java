package edu.examples.java_classes.ingredients;

import java.util.Objects;

public class Sugar extends Ingredient implements Bakinable {
	private double massFractionSucrose; // массовая доля сахарозы

	public Sugar(String name, double massFractionSucrose) {
		super(name);
		this.massFractionSucrose = massFractionSucrose;
	}

	public double getMassFractionSucrose() {
		return massFractionSucrose;
	}

	public void setMassFractionSucrose(double massFractionSucrose) {
		this.massFractionSucrose = massFractionSucrose;
	}

	@Override
	public boolean isHeatTreatmentAllowed() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(massFractionSucrose);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sugar other = (Sugar) obj;
		return Double.doubleToLongBits(massFractionSucrose) == Double.doubleToLongBits(other.massFractionSucrose);
	}

	@Override
	public String toString() {
		return "Sugar [massFractionSucrose=" + massFractionSucrose + "]";
	}

	@Override
	public int calories() {
		return 398;
	}

}
