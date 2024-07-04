package edu.examples.java_classes.main;

import edu.examples.java_classes.go.Cube;
import edu.examples.java_classes.go.GeometricObject;
import edu.examples.java_classes.go.Point3D;
import edu.examples.java_classes.go.Square;
import edu.examples.java_classes.go.Volume;

public class Main {

	public static void main(String[] args) {

		Square s = new Cube(new Point3D(0, 2, 2), new Point3D(0, 0, 0), new Point3D(2, 0, 0));
		
		if (s.getClass() == Square.class) {
			System.out.println("Object is created as an object from type Square");
		}else {
			System.out.println("Object isn't created as an object from type Square");
		}
		
		if (s.getClass() == Volume.class) {
			System.out.println("Object is created as an object from type Volume");
		}else {
			System.out.println("Object isn't created as an object from type Volume");
		}
		
		if (s.getClass() == GeometricObject.class) {
			System.out.println("Object is created as an object from type GeometricObject");
		}else {
			System.out.println("Object isn't created as an object from type GeometricObject");
		}
		
		if (s.getClass() == Cube.class) {
			System.out.println("Object is created as an object from type Cube");
		}else {
			System.out.println("Object isn't created as an object from type Cube");
		}
		
	
	}
}
