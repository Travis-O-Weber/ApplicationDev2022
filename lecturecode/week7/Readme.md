eBook Library Application
A JavaFX-based desktop application for managing and viewing different types of eBooks (PDF and Text files).
Project Structure
Copy.
├── src/
│   └── application/
│       ├── Main.java
│       ├── controller/
│       │   ├── LibraryController.java
│       │   └── MainController.java
│       ├── model/
│       │   ├── EBook.java
│       │   ├── Library.java
│       │   ├── PDFBook.java
│       │   └── TxtBook.java
│       ├── view/
│       │   ├── Library.fxml
│       │   └── Main.fxml
│       └── application.css
Prerequisites

Java JDK 8 or higher
JavaFX SDK
Any Java IDE (Eclipse, IntelliJ IDEA, etc.)

Features

View and manage different types of eBooks (PDF and Text files)
Book cover image display functionality
File selection dialog for importing book covers
Navigation between main screen and library view
Support for multiple book types through inheritance hierarchy

Architecture
The application follows the MVC (Model-View-Controller) architecture:
Models

EBook: Abstract base class for all book types
PDFBook: Implementation for PDF format books
TxtBook: Implementation for text format books
Library: Manages the collection of books

Controllers

MainController: Handles main screen interactions and navigation
LibraryController: Manages library view and book-related operations

Views

Main.fxml: Primary application interface
Library.fxml: Book library interface
CSS styling support through application.css

Setup

Clone this repository
Open the project in your preferred Java IDE
Ensure JavaFX SDK is properly configured in your project
Run Main.java to start the application

Development
Adding New Features

Create new model classes by extending EBook for new book types
Implement required controllers in the controller package
Design corresponding FXML views
Update the Library class to handle new book types

Building
To build the project:

Compile all Java files
Ensure all FXML and CSS resources are included in the build
Package the application using your IDE's build tools
