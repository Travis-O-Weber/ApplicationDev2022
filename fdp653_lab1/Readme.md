Jurassic Park Dinosaur Management System
Overview
This Java-based system simulates a dinosaur park management system, allowing users to create and manage different types of dinosaurs within a park environment. The system implements object-oriented programming principles including inheritance, interfaces, and polymorphism.
Class Structure
Main Components

Dinosaur Interface

Defines basic behaviors for all dinosaurs
Methods include: toString(), isVegetarian(), getName(), getType()


Abstract Classes

Sauropod: Base class for herbivorous dinosaurs like Apatosaurus and Brachiosaurus
Theropod: Base class for carnivorous dinosaurs like Velociraptor and Tyrannosaurus
Stegosaur: Base class for herbivorous dinosaurs like Stegosaurus


Concrete Dinosaur Classes

Apatosaurus: Extends Sauropod
Brachiosaurus: Extends Sauropod
Velociraptor: Extends Theropod
Tyrannosaurus: Extends Theropod
Stegosaurus: Extends Stegosaur


Park Management

Park: Manages a collection of dinosaurs
Features include:

Adding dinosaurs
Displaying park information
Managing park capacity





Features

Create different types of dinosaurs with unique names
Track dietary preferences (carnivore/herbivore)
Manage dinosaur population within park capacity
Display formatted park and dinosaur information

Usage Example
javaCopy// Create a new park
Park jurassicPark = new Park("Jurassic Park", 10);

// Create dinosaurs
Theropod blue = new Velociraptor("Blue", false);
Sauropod littleFoot = new Apatosaurus("Littlefoot", true);

// Add dinosaurs to park
jurassicPark.addDino(blue);
jurassicPark.addDino(littleFoot);

// Display park information
System.out.println(jurassicPark);
Class Hierarchy
CopyDinosaur (Interface)
├── Sauropod (Abstract)
│   ├── Apatosaurus
│   └── Brachiosaurus
├── Theropod (Abstract)
│   ├── Velociraptor
│   └── Tyrannosaurus
└── Stegosaur (Abstract)
    └── Stegosaurus
Implementation Details
Park Management

Maximum capacity: 10 dinosaurs
Tracks current dinosaur count
Prevents exceeding capacity
Provides formatted display of park status

Dinosaur Properties

Name
Dietary preference (vegetarian/carnivore)
Type and subtype classification
String representation for display

Technical Requirements

Java Development Kit (JDK)
Object-Oriented Programming knowledge
Understanding of inheritance and interfaces
