package edu.examples.java_classes.go;

import java.util.Objects;

public class Circle extends GeometricObject implements Square {
	
	private Point2D center;
	private double radius;
	
	public Circle(String color, Point2D center, double radius) {
		super(color);
		this.center = center;
		this.radius = radius;
	}

	public Point2D getCenter() {
		return center;
	}

	public void setCenter(Point2D center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(center, radius);
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
		Circle other = (Circle) obj;
		return Objects.equals(center, other.center)
				&& Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + ", getColor()=" + getColor() + "]";
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
