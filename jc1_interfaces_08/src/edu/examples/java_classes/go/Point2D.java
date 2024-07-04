package edu.examples.java_classes.go;

import java.util.Objects;

public class Point2D extends GeometricObject {
	
	private double x;
	private double y;
	
	public Point2D(String color, double x, double y) {
		super(color);
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(x, y);
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
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + ", getColor()=" + getColor() + "]";
	}
	
	

}
