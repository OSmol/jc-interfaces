package edu.examples.java_classes.ingredients;

public class Oil extends Ingredient implements Saladable {
	private int pourPoint; // температура застывания
	
	@Override
	public int shelfLifeIngredientInSalad() {
		return SHELF_LIFE_OF_SALAD_FROM_FRESH_VEGETABLES_AND_FRUITS_IN_DAYS;
	}

	@Override
	public int shelfLifeIngredientInSaladInRefrigerator() {
		return SHELF_LIFE_OF_SALAD_FROM_FRESH_VEGETABLES_AND_FRUITS_IN_DAYS + 2;
	}

}
