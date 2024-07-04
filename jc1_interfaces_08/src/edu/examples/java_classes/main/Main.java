package edu.examples.java_classes.main;

import edu.examples.java_classes.go.Cube;
import edu.examples.java_classes.go.GeometricObject;
import edu.examples.java_classes.go.Point3D;
import edu.examples.java_classes.go.Square;
import edu.examples.java_classes.go.Volume;

public class Main {

	public static void main(String[] args) {
		Square s = new Cube(new Point3D(0, 2, 2), new Point3D(0, 0, 0), new Point3D(2, 0, 0));
		
		if (s instanceof Square) {
			System.out.println("(Square)s -> admissible");
		}
		
		if (s instanceof Volume) {
			Volume v = (Volume)s;
			System.out.println("(Volume)s -> admissible");
		}
		
		if (s instanceof GeometricObject) {
			System.out.println("(GeometricObject)s -> admissible");
		}
		
		Object o = new Cube(new Point3D(0, 2, 2), new Point3D(0, 0, 0), new Point3D(2, 0, 0));
		
		if (o instanceof Square) {
			System.out.println("(Square)o -> admissible");
		}
		
		if (o instanceof Volume) {
			Volume v = (Volume)s;
			System.out.println("(Volume)o -> admissible");
		}
		
		if (o instanceof GeometricObject) {
			System.out.println("(GeometricObject)o -> admissible");
		}
		
	}
}
