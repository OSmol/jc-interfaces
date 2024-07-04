package edu.examples.java_classes.go;

public interface Square {
	double calculateArea();

	default String info() {
		return "This figure has an area";
	}

	boolean equals(Object o);
	/*
	default boolean equals(Object o) {
		return null;
	}
	
	default int hashCode() {
		return 1;
	}
	
	default String toString() {
		return "";
	}
	*/
	
	/*
	default void finalize() {
		
	}
	
	default Object clone() {
		return null;
	}
	*/
}
