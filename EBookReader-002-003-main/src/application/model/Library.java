package application.model;

import java.io.File;
import java.util.ArrayList;

public class Library {

	
	private static String directory;
	private static ArrayList<EBook> books = new ArrayList<EBook>();
	
	
	/**
	 * Load all books from the given location into the library.
	 * 
	 * @param directory - file object location of the directory.
	 */
	public static void loadBooks( File directory ) {
		
		// Save the String representation of the fully qualified path
		String path = directory.getAbsolutePath();
		Library.directory = path;
		
		// Loop through all files and add books to the library
		// REMINDER: title and author is the name of the file
		File[] files = directory.listFiles();
		
		if( files != null ) {
			for( File book : files ) {
				// create a book object
				EBook temp = new TxtBook( book.getName() );				
				// add that book object to this library
				books.add( temp );
			}
		}
	}
	
	/**
	 * Get all books in the library.
	 * 
	 * @return ArrayList<EBook> all ebooks in the library
	 */
	public static ArrayList<EBook> getBooks(){
		return books;
	}
}
