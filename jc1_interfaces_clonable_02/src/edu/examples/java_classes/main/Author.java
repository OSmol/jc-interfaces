package edu.examples.java_classes.main;

import java.util.Objects;

public class Author implements Cloneable {
	private String name;
	private String surname;

	public Author() {
	}

	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", surname=" + surname + "]";
	}
/*	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
*/
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
