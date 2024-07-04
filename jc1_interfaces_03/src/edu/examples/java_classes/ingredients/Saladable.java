package edu.examples.java_classes.ingredients;

public interface Saladable {
	
	// срок хранения салата из свежих овощей и фруктов в днях
	int SHELF_LIFE_OF_SALAD_FROM_FRESH_VEGETABLES_AND_FRUITS_IN_DAYS = 0;

	// срок хранения салата с заправкой сметаной в минутах
	int SHELF_LIFE_OF_SALAD_WITH_SOUR_CREAM_DRESSING_IN_MINUTES = 30;

	// срок хранения салата с заправкой майонезом в минутах
	int SHELF_LIFE_OF_SALAD_DRESSING_WITH_MAYONNAISE_IN_MINUTE = 120;
	
	// срок годности ингредиента в салате
	int shelfLifeIngredientInSalad();// public abstract
	
	// срок годности ингредиента в салате в холодильнике
	int shelfLifeIngredientInSaladInRefrigerator();

}
