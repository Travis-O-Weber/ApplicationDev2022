Java Threading Demonstrations
This repository contains two Java projects demonstrating different aspects of multi-threading in Java:

Basic Thread Creation (ThreadDemo)
Synchronized Thread Execution (SyncDemo)

Project Structure
Copy.
├── src/
│   ├── ThreadDemo.java
│   └── SyncDemo.java
└── README.md
ThreadDemo: Basic Threading Example
This example demonstrates the fundamental concepts of thread creation in Java using two different approaches:

Implementing the Runnable interface
Extending the Thread class (shown in comments)

The project shows how to:

Create and start a new thread
Execute tasks concurrently with the main thread
Print numbers from both the main thread and a custom thread simultaneously

Key Components:

MyTask: A class implementing Runnable that prints numbers from 1 to 9
Main thread: Prints its own sequence of numbers

SyncDemo: Synchronized Printing Example
This project demonstrates thread synchronization using a shared printer resource. It shows how to:

Use synchronized methods to prevent thread interference
Share resources between multiple threads safely
Implement a basic printer spooler simulation

Key Components:

Printer: A class with a synchronized method to print documents
MyThread: Prints "MyProfile.pdf" (20 copies)
YourThread: Prints "YourProfile.pdf" (15 copies)

Usage
Running ThreadDemo:
javaCopyjava ThreadDemo
Output will show interleaved printing from both the main thread and MyTask thread.
Running SyncDemo:
javaCopyjava SyncDemo
Output will show synchronized printing of two different documents.
Technical Notes

The projects are configured for Java 8 (JDK 1.8)
Eclipse project files are included
Both examples use different threading approaches for educational purposes
The SyncDemo includes commented code for thread joining (currently disabled)

Key Learning Points

Thread Creation Methods:

Using Runnable interface
Extending Thread class


Thread Synchronization:

Using synchronized methods
Resource sharing between threads


Thread Control:

Starting threads
Basic thread coordination (commented join() examples)
