package edu.examples.java_classes.main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Author a1 = new Author("Кристиан", "Бауэр");
						
		Author a2 = (Author) a1.clone();
		
		System.out.println("All OK");
	}

}
