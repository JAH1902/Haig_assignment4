// Jeffrey "Alex" Haig
// COP 3330
// Professor Hollander
// 3/29/2019

// A class to be used in the application class that will determine
// each individual word in a text file

import java.util.Set;
import java.util.LinkedHashSet;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DuplicateRemover {

	// Sets up the set of strings called words
	Set<String> words;
	
	// Public method to copy the word into a text file
	public void write(String outputFile) {
		
		// Sets the value of the file-writer application to null
		FileWriter out = null;
		
		// Exception handling
		try {
			
			// Creates a file-writer application called out that
			// will write to a file passed to the method
			out = new FileWriter(outputFile);
			
			// Loops once for every word in the set called words
			for (String s:words) {
				
				// Adds that word to the document
				out.write(s+ "\n");
				
			}
			
			// Closes the application
			out.close();
			
		}
		
		// Exception handling with a error message
		catch (Exception e) {
			
			System.out.println("Error: Please check the document");
			
		}
				
	}
	
	// public method to remove the word from the text document and
	// add it to the set
	public void remove(String inputFile) {
		
		// Sets the scanner application to null
		Scanner in = null;
		
		// Exception handling
		try {
			
			// Creates a linked hash set
			words = new LinkedHashSet<>();
			
			// Creates a scanner object called in to read the input file
			in = new Scanner(new File(inputFile));
			
			// Loops once for every line of the file
			while(in.hasNextLine()) {
				
				// Creates a string to hold the entire line
				String wholeLine = in.nextLine();
				
				// Splits the line up into each word
				String[] w = wholeLine.split(" ");
				
				// Loops once for every letter of the word
				for(int i = 0; i < w.length; i++) {
					
					// takes the word and converts it to lowercase
					String s = w[i].toLowerCase();
					
					// adds the word to the set
					words.add(s);	
					
				}	
				
			}
		
		}
		
		// Exception handling with error message
		catch(Exception e) {
			
			System.out.println("Error: Please check the document");
			
		}
		
		// Closes the application
		in.close();
			
	}	
	
}
