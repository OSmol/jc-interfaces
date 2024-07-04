package edu.examples.java_classes.go;

import java.util.Objects;

public class Quadrate extends GeometricObject implements Square {

	private Point2D bottomLeft;
	private Point2D upperRight;

	public Quadrate(String color, Point2D bottomLeft, Point2D upperRight) {
		super(color);
		this.bottomLeft = bottomLeft;
		this.upperRight = upperRight;
	}
	

	public Quadrate(Point2D bottomLeft, Point2D upperRight) {
		super("black");
		this.bottomLeft = bottomLeft;
		this.upperRight = upperRight;
	}

	public Point2D getBottomLeft() {
		return bottomLeft;
	}

	public void setBottomLeft(Point2D bottomLeft) {
		this.bottomLeft = bottomLeft;
	}

	public Point2D getUpperRight() {
		return upperRight;
	}

	public void setUpperRight(Point2D upperRight) {
		this.upperRight = upperRight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bottomLeft, upperRight);
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
		Quadrate other = (Quadrate) obj;
		return Objects.equals(bottomLeft, other.bottomLeft) && Objects.equals(upperRight, other.upperRight);
	}

	@Override
	public String toString() {
		return "Quadrate [bottomLeft=" + bottomLeft + ", upperRight=" + upperRight + ", getColor()=" + getColor() + "]";
	}

	@Override
	public double calculateArea() {
		double side = Math.abs(upperRight.getY()) - Math.abs(bottomLeft.getY());
		return side*side;
	}
	
	public String info() {
		String s = "This figure is a quadrate. " + Square.super.info();
		return s;
	}

}
