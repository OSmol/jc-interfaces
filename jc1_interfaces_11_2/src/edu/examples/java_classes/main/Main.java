package edu.examples.java_classes.main;

import edu.examples.java_classes.go.Circle;

import edu.examples.java_classes.go.GeometricObject;
import edu.examples.java_classes.go.Point2D;

import edu.examples.java_classes.go.Quadrate;
import edu.examples.java_classes.go.Square;

public class Main {

	public static void main(String[] args) {

		Square s1 = new Circle(new Point2D(0, 0), 2.3);
		Square s2 = new Quadrate(new Point2D(0, 0), new Point2D(1, 1));

		System.out.println("Circle - " + s1.info());
		System.out.println("Quadrate - " + s2.info());

	}
}
