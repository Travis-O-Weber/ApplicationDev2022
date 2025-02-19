EBookReader
A JavaFX-based desktop application for reading and managing electronic books, with support for different book formats and a multi-view interface.
Project Structure
Copy.
├── src/
│   └── application/
│       ├── Main.java
│       ├── controller/
│       │   ├── BookController.java     # Handles book viewing
│       │   ├── LibraryController.java  # Manages library display
│       │   └── MainController.java     # Handles initial setup
│       ├── model/
│       │   ├── EBook.java             # Abstract base class
│       │   ├── Library.java           # Book collection manager
│       │   ├── PDFBook.java           # PDF format handler
│       │   └── TxtBook.java           # Text format handler
│       ├── model/test/
│       │   └── EBookTest.java         # Unit tests for EBook
│       └── view/
           ├── Main.fxml               # Directory selection view
           ├── Library.fxml            # Book list view
           └── Book.fxml               # Book reader view
Features

Directory-based library loading using DirectoryChooser
Dynamic button generation for book selection
Multi-view navigation system:

Main view for library directory selection
Library view for book listing
Book view for content reading


Book metadata management (title, authors, file path)
Automated book discovery and loading
Support for different book formats (TXT, PDF)

Model Components
EBook
javaCopypublic abstract class EBook {
    private String title;
    private ArrayList<String> authors;
    private String fullPath;
    
    // Core functionality
    public abstract String readBook();
}
Library
javaCopypublic class Library {
    private static ArrayList<EBook> books;
    
    public static void loadBooks(File directory);
    public static ArrayList<EBook> getBooks();
}
Controllers
MainController

Handles library directory selection
Validates library path
Initiates book loading process

LibraryController

Dynamically generates book buttons
Implements book selection interface
Manages navigation between views
Initializes with loaded book collection

BookController

Displays book content
Manages book metadata display
Handles book navigation controls

Testing
The project includes JUnit tests in EBookTest.java:

Path validation testing
Author management testing
Null input handling
Edge case verification

Example test:
javaCopy@Test
public final void testSetFullPath() {
    book.setFullPath("dir/subdir/");
    assert(book.getFullPath().equals("dir/subdir/"));
    
    // Null path protection test
    book.setFullPath(null);
    assert(book.getFullPath() != null);
}
Setup & Running

Clone the repository
Configure Java development environment:

Java JDK 8+
JavaFX SDK
JUnit for testing


Import project into IDE
Run Main.java
Select library directory when prompted

View Navigation Flow

Main View

Select library directory
Validate path
Load books


Library View

Display book buttons
Handle book selection
Navigate to book view


Book View

Display book content
Show book metadata
Return to library option



Development
Adding New Book Types

Extend EBook class
Implement readBook() method
Update Library.loadBooks() for format detection
Add format-specific UI elements if needed

Testing New Features

Add test cases to EBookTest.java
Verify path handling
Test null input protection
Validate author management

Contributing

Fork repository
Create feature branch
Add tests for new features
Submit pull request
Ensure tests pass
