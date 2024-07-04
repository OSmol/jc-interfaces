package edu.examples.java_classes.ingredients;

public interface Bakinable {
	// среднее время годности выпечки при хранении в пищевой пленке в днях
	int AVERAGE_SHELF_LIFE_OF_BAKED_GOODS_WHEN_STORED_IN_CLING_FILM_IN_DAYS = 2; //public static final
	
	// среднее время годности выпечки при хранении в фольге в днях
	int AVERAGE_SHELF_LIFE_OF_BAKED_GOODS_WHEN_STORED_IN_CLING_FOIL_IN_DAYS = 3;

	// среднее время годности выпечки при хранении в полиэтилене в днях
	int AVERAGE_SHELF_LIFE_OF_BAKED_GOODS_WHEN_STORED_IN_POLYETHYLENE_IN_DAYS = 4;
	
	// допускается ли тепловая обработка
	boolean isHeatTreatmentAllowed(); // public abstract
}
