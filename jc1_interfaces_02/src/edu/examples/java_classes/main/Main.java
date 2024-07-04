package edu.examples.java_classes.main;

import java.util.ArrayList;
import java.util.List;

import edu.examples.java_classes.ingredients.Bakinable;
import edu.examples.java_classes.ingredients.Ingredient;
import edu.examples.java_classes.ingredients.Saladable;
import edu.examples.java_classes.ingredients.Sugar;

public class Main {

	public static void main(String[] args) {
		List<Bakinable> list1 = new ArrayList<>();
		List<Saladable> list2 = new ArrayList<>();
		
		List<Ingredient> list3 = new ArrayList<>();
		
		Bakinable b = new Sugar();
	}
}
