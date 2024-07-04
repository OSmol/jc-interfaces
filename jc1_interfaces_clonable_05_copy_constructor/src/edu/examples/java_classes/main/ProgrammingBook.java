package edu.examples.java_classes.main;

import java.util.List;
import java.util.Objects;

public class ProgrammingBook extends Book {
	private ProgrammingLanguage language;

	public ProgrammingBook() {
	}

	public ProgrammingBook(String title, List<Author> authors, double price, int yearPublishing, ProgrammingLanguage language) {
		super(title, authors, price, yearPublishing);
	
		this.language = language;
	}
	
	public ProgrammingBook(ProgrammingBook other) {
		super(other.getTitle(), other.getAuthors(), other.getPrice(), other.getYearPublishing());		
		this.language = other.language;
	}

	public ProgrammingLanguage getLanguage() {
		return language;
	}

	public void setLanguage(ProgrammingLanguage language) {
		this.language = language;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(language);
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
		ProgrammingBook other = (ProgrammingBook) obj;
		return language == other.language;
	}

	@Override
	public String toString() {
		return "ProgrammingBook" + "[title=" + getTitle() + ", authors=" + getAuthors() + ", price=" + getPrice() + ", yearPublishing="
				+ getYearPublishing() + "]" + ", language=" + language + "]";
	}
	
	

}
