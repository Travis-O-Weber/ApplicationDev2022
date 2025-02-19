EBook Reader JavaFX Application
A JavaFX-based eBook reader application that allows users to load and read text-based books from their local filesystem. The application features a multi-view interface with a main screen, library view, and book reading view.
Features

Directory-based book loading
Library view with dynamic book listing
Individual book viewing interface
Navigation between different views
Support for TXT format books
Expandable architecture for additional book formats

Project Structure
CopyEBookReaderJavaFx/
├── src/
│   └── application/
│       ├── Main.java                 # Application entry point
│       ├── controller/
│       │   ├── MainController.java   # Handles initial book directory selection
│       │   ├── LibraryController.java # Manages library view and book selection
│       │   └── BookController.java   # Controls book reading view
│       ├── model/
│       │   ├── EBook.java           # Abstract base class for ebooks
│       │   ├── TxtBook.java         # Implementation for TXT format books
│       │   └── Library.java         # Manages book collection
│       └── view/
│           ├── Main.fxml            # Welcome screen layout
│           ├── Library.fxml         # Book selection screen layout
│           └── Book.fxml            # Book reading screen layout
├── resources/                       # Sample books and resources
│   ├── Book1.txt                   # Sample book with Lorem Ipsum content
│   └── Book2.txt                   # Sample book with Lorem Ipsum content
└── test/                           # Test resources and files
Prerequisites

Java Development Kit (JDK) 8
JavaFX 8
Eclipse IDE with e(fx)clipse plugin
JUnit 4 for testing

Setup and Running
Development Environment Setup

Install Eclipse IDE
Install e(fx)clipse plugin via Eclipse Marketplace
Ensure JDK 8 is installed and configured in Eclipse

Project Import

Clone the repository
In Eclipse:

File → Import → Existing Projects into Workspace
Select the project directory
Ensure "Copy projects into workspace" is checked
Click Finish



Running the Application

Open Main.java
Right-click → Run As → Java Application
Use the "Load Books" button to select a directory containing text files
Navigate through the library using the UI

Sample Books
The project includes two sample text files for testing and demonstration:

Book1.txt: Lorem Ipsum text sample (approximately 1KB)

Two paragraphs of sample text
Useful for testing text rendering and display


Book2.txt: Additional Lorem Ipsum text sample (approximately 1KB)

Two paragraphs of different sample text
Helpful for testing multiple book loading and navigation



These sample files can be used to:

Test the book loading functionality
Verify text display formatting
Demonstrate the application to users
Serve as templates for adding new books

User Interface
Main Screen

Welcome message
"Load Books" button to select book directory

Library View

Displays all books found in the selected directory
Dynamically generated buttons for each book
Navigation back to main screen

Book Reading View

Displays book title
Text area for book content
Navigation back to library

Implementation Details
Key Classes

Main.java: JavaFX application entry point
EBook.java: Abstract base class for all book types
TxtBook.java: Implementation for text-based books
Library.java: Static class managing book collection
Controller classes: Handle UI interactions and view transitions

FXML Views

All UI layouts are defined in FXML
Uses SceneBuilder-compatible format
Implements MVC pattern

Contributing
This is an in-class project for sections 002 and 003. Please follow the course guidelines for:

Code style and formatting
Pull request process
Testing requirements
Documentation standards

Future Enhancements

Support for additional book formats (PDF, EPUB)
Book metadata parsing
Reading progress tracking
Bookmarking functionality
Search capabilities
Customizable text display
Support for larger text files
Text formatting options
Chapter navigation
