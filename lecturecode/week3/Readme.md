Company Employee Management System
Project Overview
This Java project implements a basic employee management system that handles both hourly and salaried employees within a company. The system demonstrates object-oriented programming concepts including inheritance, abstraction, and encapsulation.
Class Structure
Company

Manages a collection of employees
Stores company name and type
Provides methods to add and manage employees
Uses ArrayList to store employee records

Employee (Abstract Class)

Base class for all employee types
Contains common attributes:

Name
Title
Hire Date


Provides abstract foundation for specific employee types

HourlyEmployee

Extends Employee class
Additional attributes:

Hourly pay rate
Hours worked per week


Specifically designed for employees paid by the hour

SalaryEmployee

Extends Employee class
Additional attributes:

Annual salary


Handles employees with fixed yearly compensation

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
    └── employee_info.csv
Running the Application

Compile all Java files
Ensure employee_info.csv is present in the data directory
Run CompanyTest.java to test the functionality

Usage Example
javaCopy// Create a new company
Company company = new Company("CS Company", 10);

// Add hourly employee
HourlyEmployee hourlyEmp = new HourlyEmployee("Alex", "Software Engineer", 
    "09-07-2022", 40, 20.5);

// Add salary employee
Employee salaryEmp = new SalaryEmployee("Amanda", "Software Engineer", 
    "09-07-2022", 80000);

// Add employees to company
company.addEmployee(hourlyEmp);
company.addEmployee(salaryEmp);
Features

Support for both hourly and salaried employees
File-based data input through CSV
Flexible employee management system
Extensible design for adding new employee types
