// Jeffrey "Alex" Haig
// COP 3330
// Professor Hollander
// 3/30/2019

// A class used by application class to count each 
// word in a text file

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

	// Sets up a hash map called count
	HashMap<String, Integer> count = new HashMap<>();
	
	//Method to keep count of each word
	public void count(String input) {
		
		// Sets the scanner to null
		Scanner scn = null;
		
		// Exception handling
		try {
		
			// Sets up the scanner object to read in
			// the input file
			scn = new Scanner(new File(input));
			
			// Loops until the text file does not have
			// a next line
			while (scn.hasNextLine()) {
				
				// Creates a string variable to hold the
				// next word in the file
				String word = scn.next();
			
				// If statement to determine if the next
				// word is a null statement
				if (word != null) {
					
					// Converts the string to lowercase
					word = word.toLowerCase();
					
					// If statement to determine if the word already
					// exists in the map
					if (count.containsKey(word)) {
						
						// Adds one to that set of the map
						count.put(word,  count.get(word) + 1);
						
					} 
					
					// Counter to the if statement
					else {
						
						// Puts a new word in the map
						count.put(word, 1);
						
					}
					
				}	
				
			}
		
		}
		
		// Exception handling with error message
		catch (Exception e) {
			
			System.out.println("File not found");
			
		}
		
		// Closes the application
		scn.close();
		
	}
	
	// Method that will write the map values into a
	// text file
	public void write(String output) {
		
		// Exception handling
		try {
		
			// Sets up a file writer object to write values
			// into a text file
			FileWriter write = new FileWriter(output);
			
			// Loops until there is not a next value in the map set
			for (Map.Entry<String, Integer>e:count.entrySet()) {
				
				// Writes the key and the value of the map to the file
				write.write(e.getKey() + "\t" + e.getValue() + "\n");
				
			}
			
			// Closes the application
			write.close();
		
		}
		
		// Exception handling
		catch (Exception e) {
			
			System.out.println("Error: Cannot write to file");
			
		}
		
	}
	
}
