package edu.examples.java_classes.main;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Readable read = new ReadFromInternet();
		
		try {
			String r = read.read(new URI("https://www.it-academy.by/"));
			System.out.println(r);
			
			System.out.println();
			
			r = read.read("resources/text.txt");
			System.out.println(r);
					
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
