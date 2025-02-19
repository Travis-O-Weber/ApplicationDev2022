package application.model;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class EBook {

	private String title;
	private ArrayList<String> authors;
	private String fullPath;

	public EBook( String title ) {
		this.title = title;
		this.authors = new ArrayList<String>();
	}

	public void setFullPath( String path ) {
		if(path != null)
			this.fullPath = path;
	}

	public String getFullPath() {
		return this.fullPath;
	}


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public ArrayList<String> getAuthors(){
		return this.authors;
	}

	public String toString() {
		return title;
	}

	public abstract String readBook();
}