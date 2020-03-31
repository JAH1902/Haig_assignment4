// Jeffrey "Alex" Haig
// COP 3330
// Professor Hollander
// 3/29/2019

// An application class that will utilize the methods in class
// DeplicareCounter

public class Application {

	public static void main(String[] args) {
		
		// Creates an object of type DuplicateCounter
		DuplicateCounter dC = new DuplicateCounter();
		
		// Exception handling
		try {
			
			// Runs the object method count with the input file
			dC.count("problem2.txt");
			
		}
		
		// Exception handling with error state message
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		// Exception handling
		try {
			
			
			// Runs the object method write with the output file
			dC.write("unique_word_counts.txt");
			
		}
		
		// Exception handling with error stack message
		catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
