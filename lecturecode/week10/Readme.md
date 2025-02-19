EBookReader Application
A JavaFX-based eBook reader application that supports multiple file formats and provides a simple interface for managing and reading digital books.
Features

Load and manage a library of eBooks
Support for multiple file formats (TXT, PDF)
Book metadata management (title, authors)
Simple and intuitive user interface
Directory-based library organization

Project Structure
CopyEBookReader/
├── src/
│   └── application/
│       ├── model/
│       │   ├── EBook.java         # Abstract base class for all book types
│       │   ├── TxtBook.java       # Text file implementation
│       │   ├── PDFBook.java       # PDF file implementation
│       │   └── Library.java       # Book collection management
│       ├── view/
│       │   └── Main.fxml         # JavaFX UI layout
│       ├── Main.java             # Application entry point
│       └── application.css       # Styling definitions
└── test/
    └── application/
        └── model/
            └── EBookTest.java    # Unit tests
Prerequisites

Java JDK 11 or higher
JavaFX SDK
JUnit (for running tests)

Getting Started

Clone the repository:

bashCopygit clone https://github.com/yourusername/EBookReader.git

Set up your development environment:

Ensure JavaFX is properly configured in your IDE
Add required libraries to your build path


Build and run the application:

bashCopyjavac application/Main.java
java application.Main
Usage

Launch the application
Use the file menu to select a directory containing eBooks
Browse your library in the main window
Select a book to view its contents

Development
Adding New Book Formats

Create a new class extending EBook
Implement the readBook() method
Add format detection in the Library class
Update tests accordingly

Running Tests
bashCopyjavac -cp .:junit.jar application/model/test/EBookTest.java
java -cp .:junit.jar org.junit.runner.JUnitCore application.model.test.EBookTest
Contributing

Fork the repository
Create your feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request
