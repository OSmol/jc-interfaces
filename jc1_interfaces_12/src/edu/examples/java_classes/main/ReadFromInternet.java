package edu.examples.java_classes.main;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class ReadFromInternet implements Readable {

	@Override
	public String read(URI uri) throws IOException {
		URL url = uri.toURL();
		// Retrieving the contents of the specified page
		Scanner sc = new Scanner(url.openStream());
		// Instantiating the StringBuffer class to hold the result
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.next());
			// System.out.println(sc.next());
		}
		// Retrieving the String from the String Buffer object
		String result = sb.toString();
		System.out.println(result);
		// Removing the HTML tags
		result = result.replaceAll("<[^>]*>", "");
		return result;
	}

}
