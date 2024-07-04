package edu.examples.java_classes.go;

import java.util.Objects;

public class Point3D extends GeometricObject {

	private double x;
	private double y;
	private double z;

	public Point3D(String color, double x, double y, double z) {
		super(color);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point3D(double x, double y, double z) {
		super("black");
		this.x = x;
		this.y = y;
		this.z = z;
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(x, y, z);
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
		Point3D other = (Point3D) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y)
				&& Double.doubleToLongBits(z) == Double.doubleToLongBits(other.z);
	}

	@Override
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + ", z=" + z + ", getColor()=" + getColor() + "]";
	}

}
