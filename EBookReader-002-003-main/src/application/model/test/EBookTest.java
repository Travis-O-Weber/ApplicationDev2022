package application.model.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import application.model.EBook;
import application.model.TxtBook;

public class EBookTest {
	
	EBook book;
	
	@Before
	public final void setup() {
		book = new TxtBook("Test Book");	
	}

	@Test
	public final void testSetFullPath() {
		//fail("Not yet implemented"); // TODO
		
		// preconditions = parameter (String path)
		// postconditions = class variable updated (String fullPath)
		
		book.setFullPath("dir/subdir/");
		assert( book.getFullPath().equals( "dir/subdir/" )) : "Incorrect path: " + book.getFullPath();
		
		// bad case - set it to be something we know is not OK
		book.setFullPath(null);
		assert( book.getFullPath()!= null) : "Null path enabled: " + book.getFullPath();
		
		
	}

	@Ignore
	public final void testSetAuthors() {
		//fail("Not yet implemented"); // TODO
		
		// preconditions = parameter (ArrayList<String> authors)
		// postconditions = class variable updated (ArrayList<String> authors)

		ArrayList<String> testList = new ArrayList<String>();		
		testList.add("John Smith");
		book.setAuthors(testList);		
		assert( book.getAuthors().equals( testList )) : "Incorrect authors list: " + book.getAuthors();

		// bad case - set it to be something we know is not OK
		book.setAuthors(null);
		assert( book.getAuthors()!= null) : "Null authors enabled: " + book.getAuthors();
	}

}
