package edu.examples.java_classes.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URI;

public interface Readable {
	
	String read(URI uri) throws Exception;
	
	default String read(String fileName) throws Exception {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
		BufferedReader breader = new BufferedReader(reader);

		String line;
		StringBuilder result = new StringBuilder();
		while ((line = breader.readLine()) != null) {
			result.append(line + "\n");
		}
		return result.toString();
	}

}
