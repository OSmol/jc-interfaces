package edu.examples.java_classes.go;

import java.util.Objects;

public class GeometricObject {
	private String color;

	public GeometricObject(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeometricObject other = (GeometricObject) obj;
		return Objects.equals(color, other.color);
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + "]";
	}

}
