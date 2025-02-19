Company Employee Management System
Project Overview
This Java project implements a basic employee management system that handles both hourly and salaried employees within a company. The system demonstrates object-oriented programming concepts including inheritance, abstraction, and encapsulation, with support for loading employee data from CSV files.
Class Structure
Company

Manages a collection of employees
Stores company name and type
Provides methods to add and manage employees
Uses ArrayList to store employee records
Includes file loading functionality for employee data

Employee (Abstract Class)

Base class for all employee types
Contains common attributes:

Name
Title
Hire Date


Provides getters and setters for all attributes

HourlyEmployee

Extends Employee class
Additional attributes:

Hourly pay rate
Hours worked per week


Includes getters and setters for pay rate and hours

SalaryEmployee

Extends Employee class
Additional attributes:

Annual salary


Includes getters and setters for annual salary

Getting Started
Prerequisites

Java Development Kit (JDK)
Any Java IDE (Eclipse, IntelliJ IDEA, etc.)

File Structure
Copyproject-root/
├── src/
│   ├── Company.java
│   ├── CompanyTest.java
│   ├── Employee.java
│   ├── HourlyEmployee.java
│   └── SalaryEmployee.java
└── data/
    └── employees.csv
CSV File Format
The system expects a CSV file with the following format:
CopyEmployeeType,Name,Title,HireDate,Pay[,HoursPerWeek]
Where:

EmployeeType: 'S' for Salary Employee, 'H' for Hourly Employee
Name: Employee's full name
Title: Job title
HireDate: Date of hire
Pay: Annual salary for salaried employees or hourly rate for hourly employees
HoursPerWeek: Only required for hourly employees

Example:
CopyS,John Doe,Manager,2024-01-15,75000
H,Jane Smith,Developer,2024-02-01,35.50,40
Running the Application

Ensure your CSV file is properly formatted and placed in the data directory
Run CompanyTest.java, which will:

Create a new company instance
Load employees from the CSV file



Usage Example
javaCopy// Create a new company
Company company = new Company("CS Company", 10);

// Load employees from CSV file
company.loadEmployeesFromFile("data/employees.csv");
Features

Support for both hourly and salaried employees
Automated employee data loading from CSV files
Error handling for file operations
Flexible employee management system
Extensible design for adding new employee types

Future Enhancements

Implement toString() methods for better object representation
Add employee search functionality
Include payroll calculation features
Add data persistence
Implement employee removal functionality
Add data validation for CSV input
Support for exporting employee data
