package edu.examples.java_classes.ingredients;

import java.util.Objects;

public class Ingredient {
	private String name;

	public Ingredient(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredient other = (Ingredient) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + "]";
	}
	
	
}
