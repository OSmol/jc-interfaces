package edu.examples.java_classes.ingredients;

import java.util.Objects;

public class Carrot extends Ingredient implements Saladable {
	private String color;

	public Carrot(String name, String color) {
		super(name);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int shelfLifeIngredientInSalad() {
		return SHELF_LIFE_OF_SALAD_FROM_FRESH_VEGETABLES_AND_FRUITS_IN_DAYS;
	}

	@Override
	public int shelfLifeIngredientInSaladInRefrigerator() {
		return SHELF_LIFE_OF_SALAD_FROM_FRESH_VEGETABLES_AND_FRUITS_IN_DAYS + 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color);
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
		Carrot other = (Carrot) obj;
		return Objects.equals(color, other.color);
	}

	@Override
	public String toString() {
		return "Carrot [color=" + color + "]";
	}

	@Override
	public int calories() {
		return 32;
	}

}
