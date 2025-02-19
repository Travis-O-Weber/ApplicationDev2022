Simple Banking System
This is a basic Java implementation of a banking system designed for educational purposes. The system demonstrates fundamental object-oriented programming concepts including class relationships, encapsulation, and basic array management.
Project Structure
The project consists of three main classes:
Account.java

Represents an individual bank account
Contains account holder's name and balance information
Provides methods for:

Getting and setting account details
Comparing accounts (equality based on account holder's name)
String representation of account information



Bank.java

Represents a banking institution
Manages an array of Account objects
Features include:

Bank name and government ID
Account management (adding new accounts)
Array-based storage of accounts with fixed capacity
Comparison of banks based on government ID



AccountTest.java

Contains the main method for testing the banking system
Demonstrates usage of Bank and Account classes
Shows example operations like:

Creating new accounts
Adding accounts to a bank
Modifying account information



Usage Example
javaCopy// Create a new bank with capacity for 10 accounts
Bank myBank = new Bank("CS3443", 10);

// Create some accounts
Account account1 = new Account("Alex");
Account account2 = new Account("Adam");

// Add an account to the bank
myBank.addAccount(account1);

// Modify account information
account1.setName("Sam");

// Compare accounts
boolean areEqual = account1.equals(account2);
Features

Account creation with name and optional starting balance
Account management within a bank
Basic account operations (get/set name, balance)
Bank management with fixed account capacity
Account equality comparison
Custom string representations for both Account and Bank classes

Notes

The Bank class uses a fixed-size array for account storage
Account equality is determined by account holder name
Bank equality is determined by government ID
The system includes basic error checking and null handling
This is a demonstration project for learning purposes
