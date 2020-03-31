// Jeffrey "Alex" Haig
// COP 3330
// Professor Hollander
// 3/29/2019

// A class that will call upon the Duplicate Remover class to 
// determine the individual words in a text file

public class Application {

	public static void main(String[] args) {
		
		// creates an object called dp which has a form of the public
		// class DuplicateRemover
		DuplicateRemover dp = new DuplicateRemover();
		
		// Calls on the object method remove and passes the name
		// of the text file to be read from
		dp.remove("problem1.txt");
		
		// Calls on the object method write and passes the name
		// of the text file to be written to
		dp.write("unique_words.txt");
		
	}

}
