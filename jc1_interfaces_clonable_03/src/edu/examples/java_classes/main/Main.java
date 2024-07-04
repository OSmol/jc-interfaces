package edu.examples.java_classes.main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Book book1 = new Book("Java Persistence API and Hibernate", Arrays.asList(new Author("Кристиан", "Бауэр"),
				new Author("Гэри", "Грегори"), new Author("Гэвин", "Кинг")), 54, 2020);

		Book book2 = (Book) book1.clone();

		System.out.println("book1 == book2 - " + (book1 == book2));
		System.out.println("book1.authors == book2.authors - " + (book1.getAuthors() == book2.getAuthors()));

		List<Author> list1 = book1.getAuthors();
		List<Author> list2 = book2.getAuthors();

		System.out.println("list1.size == list2.size - " + (list1.size() == list2.size()));

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + ") author1.equals(author2) - " + (list1.get(i).equals(list2.get(i))) + "; author1 == author2 - " + (list1.get(i) == list2.get(i)));
		}

	}

}
