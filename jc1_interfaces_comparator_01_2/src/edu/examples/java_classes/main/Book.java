package edu.examples.java_classes.main;

import java.util.List;
import java.util.Objects;

public class Book  {
	private String title;
	private List<Author> authors;
	private double price;
	private int yearPublishing;

	public Book() {
	}

	public Book(String title, List<Author> authors, double price, int yearPublishing) {
		this.title = title;
		this.authors = authors;
		this.price = price;
		this.yearPublishing = yearPublishing;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authors, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authors, other.authors)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", price=" + price + ", yearPublishing="
				+ yearPublishing + "]";
	}



}
