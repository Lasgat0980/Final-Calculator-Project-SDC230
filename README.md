# Final-Calculator-Project-SDC230
Dickens Math-Pro v5.0
Developer: Lastazia Dickens

Date: May 8, 2026

Assignment: SDC230 Final Project - Integrated Calculator

1. Project Overview
The Dickens Math-Pro v5.0 is a robust Java-based console application designed to provide high-precision mathematical calculations. This project demonstrates advanced software development concepts, including Object-Oriented Programming (OOP), Custom Exception Handling, and Dynamic Memory Management.

2. Core Features
Standard Arithmetic: Supports Addition, Subtraction, Multiplication, and Division with decimal precision.

Multi-Value Processing: Allows users to input a sequence of numbers (e.g., 10 20 5.5) to perform batch calculations in one step.

Persistent Session Memory: A "Vault" system that stores up to 10 full mathematical operations (e.g., 5.00 + 5.00 = 10.000) for later recall.

Memory Management: Users can view their calculation history or wipe the vault clean to start fresh.

3. Technical Architecture
The application is built using a modular approach to ensure code maintainability:

App.java (The Controller): Manages the user interface, menu navigation, and the coordination between math logic and memory storage.

Division.java (The Logic Class): A specialized class dedicated to division that implements explicit error checking.

CalculationMemory.java (The Data Class): Encapsulates an ArrayList to manage the storage and retrieval of session data.

4. Robustness & Fail-Safes
This application is designed to handle "messy" user input without crashing:

Input Validation: Uses InputMismatchException to catch letters or symbols entered into numeric fields.

Zero-Division Protection: Implements ArithmeticException to provide a friendly warning instead of a system failure when dividing by zero.

Scanner Buffer Management: Specifically clears the scanner buffer after errors to prevent the "infinite loop" bug common in console apps.

Collection Limits: Hard-coded constraints prevent the memory from exceeding 10 entries, simulating hardware memory limits.



Project Name: Dickens Math-Pro v5.0

Project Description

The Dickens Math-Pro v5.0 is a comprehensive exploration of fundamental Java programming concepts and software development practices. The goal was to create a standalone, functional application that demonstrates proficiency in solo project management, object-oriented coding, and version control using GitHub.

Project Tasks
Task 1: Set up the development environment

Configured Visual Studio Code and Java Development Kit (JDK).

Initialized local and remote Git repositories for version control.

Task 2: Plan the project

Defined the project scope, including requirements for basic math, multi-value parsing, and session memory.

Created a development timeline to meet graduation and submission milestones.

Task 3: Implement core features

Developed the main App controller to manage the Windows console interface.

Built the Division and CalculationMemory classes to handle logic and data storage.

Task 4: Test the application

Conducted unit testing on arithmetic operations and exception handling.

Debugged input validation logic to ensure the program remains stable during user errors.

Task 5: Document the project

Created a comprehensive README file to guide users and developers.

Documented the modular approach used to separate math logic from data storage.

Task 6: Finalize and submit

Refined code comments and formatting for professional presentation.

Uploaded the final version to GitHub and prepared the submission walkthrough.

Project Skills Learned
Independent software development and debugging in Java.

Git and GitHub for version control and repository management.

Designing crash-proof applications using advanced Exception Handling.

Technical writing and project documentation.

Time management and project planning as a solo developer.

Language Used
Java: Selected for its strict object-oriented structure, which allowed me to practice encapsulation and maintainable code design.

Link to Project (YouTube): https://youtu.be/_zaWpV0VKaU

