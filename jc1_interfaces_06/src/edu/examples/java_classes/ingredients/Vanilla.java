package edu.examples.java_classes.ingredients;

import java.util.Objects;

public class Vanilla extends Ingredient implements Bakinable {
	private KindOfVanillin kindOfVanillin;

	public enum KindOfVanillin {
		CRYSTALS, WATER_SOLUTION, OIL_SOLUTION;
	}

	public Vanilla(String name, KindOfVanillin kindOfVanillin) {
		super(name);
		this.kindOfVanillin = kindOfVanillin;
	}

	public KindOfVanillin getKindOfVanillin() {
		return kindOfVanillin;
	}

	public void setKindOfVanillin(KindOfVanillin kindOfVanillin) {
		this.kindOfVanillin = kindOfVanillin;
	}

	@Override
	public boolean isHeatTreatmentAllowed() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(kindOfVanillin);
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
		Vanilla other = (Vanilla) obj;
		return kindOfVanillin == other.kindOfVanillin;
	}

	@Override
	public String toString() {
		return "Vanilla [kindOfVanillin=" + kindOfVanillin + "]";
	}

	@Override
	public int calories() {
		return 287;
	}

}
