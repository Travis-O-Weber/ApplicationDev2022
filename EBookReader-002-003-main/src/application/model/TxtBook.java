package application.model;

public class TxtBook extends EBook{

	public TxtBook(String title) {
		super(title);
	}

	@Override
	public String readBook() {
		return "";		
	}

}
