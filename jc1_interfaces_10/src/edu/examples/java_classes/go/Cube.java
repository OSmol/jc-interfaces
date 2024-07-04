package edu.examples.java_classes.go;

import java.util.Objects;

public class Cube extends GeometricObject implements Square, Volume {

	private Point3D p1;
	private Point3D p2;
	private Point3D p3;

	public Cube(Point3D p1, Point3D p2, Point3D p3) {
		super("black");
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point3D getP1() {
		return p1;
	}

	public void setP1(Point3D p1) {
		this.p1 = p1;
	}

	public Point3D getP2() {
		return p2;
	}

	public void setP2(Point3D p2) {
		this.p2 = p2;
	}

	public Point3D getP3() {
		return p3;
	}

	public void setP3(Point3D p3) {
		this.p3 = p3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(p1, p2, p3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cube other = (Cube) obj;
		return Objects.equals(p1, other.p1) && Objects.equals(p2, other.p2) && Objects.equals(p3, other.p3);
	}

	@Override
	public String toString() {
		return "Cube [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", getClass()=" + getClass() + "]";
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String info() {
		return "This figure has both area and volume.";
	}

}
