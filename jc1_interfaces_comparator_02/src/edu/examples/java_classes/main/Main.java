package edu.examples.java_classes.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Book book1 = new Book("97 вещей, о которых должен знать каждый Java-программист",
				Arrays.asList(new Author("Хенни", "Кевлин"), new Author("Триша", "Джи")), 114, 2023);

		Book book2 = new Book("Java Persistence API and Hibernate", Arrays.asList(new Author("Кристиан", "Бауэр"),
				new Author("Гэри", "Грегори"), new Author("Гэвин", "Кинг")), 54, 2020);

		Book book3 = new Book("Принципы юнит-тестирования", Arrays.asList(new Author("Владимир", "Хориков")), 97, 2023);

		List<Book> library = new ArrayList<>();
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		
		Collections.sort(library);

		for (Book book : library) {
			System.out.println(book);
		}
		
		System.out.println(" ----------------------------------------------------------------------------------- ");
		
		Collections.sort(library, new BookByPriceComparator());

		for (Book book : library) {
			System.out.println(book);
		}

	}

}
