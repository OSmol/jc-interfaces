package edu.examples.java_classes.main;

import edu.examples.java_classes.go.Cube;
import edu.examples.java_classes.go.GeometricObject;
import edu.examples.java_classes.go.Point3D;
import edu.examples.java_classes.go.Square;
import edu.examples.java_classes.go.Volume;

public class Main {

	public static void main(String[] args) {

		Square s = new Cube(new Point3D(0, 2, 2), new Point3D(0, 0, 0), new Point3D(2, 0, 0));
		Volume v = new Cube(new Point3D(0, 2, 2), new Point3D(0, 0, 0), new Point3D(2, 0, 0));

		System.out.println(s.info());
		System.out.println(v.info());

	}
}
