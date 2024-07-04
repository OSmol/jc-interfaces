package edu.examples.java_classes.ingredients;

import java.util.Objects;

public class Oil extends Ingredient implements Saladable {
	private int pourPoint; // температура застывания

	public Oil(String name, int pourPoint) {
		super(name);
		this.pourPoint = pourPoint;
	}

	public int getPourPoint() {
		return pourPoint;
	}

	public void setPourPoint(int pourPoint) {
		this.pourPoint = pourPoint;
	}

	@Override
	public int shelfLifeIngredientInSalad() {
		return SHELF_LIFE_OF_SALAD_FROM_FRESH_VEGETABLES_AND_FRUITS_IN_DAYS;
	}

	@Override
	public int shelfLifeIngredientInSaladInRefrigerator() {
		return SHELF_LIFE_OF_SALAD_FROM_FRESH_VEGETABLES_AND_FRUITS_IN_DAYS + 2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(pourPoint);
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
		Oil other = (Oil) obj;
		return pourPoint == other.pourPoint;
	}

	@Override
	public String toString() {
		return "Oil [pourPoint=" + pourPoint + "]";
	}

	@Override
	public int calories() {
		return 899;
	}

}
