The documentation generated for senior is as follows:

# IIT Tirupati Student Database - Java Project

This project implements a student database management system using Java. It leverages object-oriented principles to represent students, including undergraduates and graduates, along with their attributes like courses, faculty advisors, and semesters.

## Architecture and Dependencies

* **Language:** Java
* **Dependencies:** Java standard libraries (java.util.ArrayList, java.util.HashMap, java.util.Scanner). No external dependencies are required.
* **Data Storage:** In-memory HashMap for storing student data (using roll number as the key).

## Core Components

### 1. Student Class:

Represents a generic student. Attributes include name, roll number, semester, list of courses, and faculty advisor.

### 2. GraduateStudent Class

Extends the `Student` class using inheritance.  Provides specialized representation for Graduate Students, inheriting all attributes from the `Student` class. The `toString()` method is overridden to prepend "Graduate Student Details:\n" before displaying the student information.

### 3. StudentDatabase Class:

Manages student records. Core functionalities:

* `addStudent(Student student)`: Adds a new student to the database. Handles duplicate roll number entries.
* `updateStudent(String rollNumber, Student updatedStudent)`: Updates an existing student's information.
* `deleteStudent(String rollNumber)`: Deletes a student from the database.
* `viewStudent(String rollNumber)`: Retrieves and displays a student's information.
* `studentExists(String rollNumber)`: Checks if a student with the given roll number exists in the database.

### 4. Viva Class (Main Application)

Contains the `main` method.  Provides a command-line interface for interacting with the database. Offers two modes of operation:

* **Admin Mode:** Allows adding (undergraduate and graduate), updating, and deleting student records.
* **User Mode:** Allows viewing student details by providing the roll number.

Input validation and error handling are implemented throughout the application to ensure data integrity and user experience. The Scanner class is used to get the input data from the user.

## Critical Logic

* **HashMap for Storage:** The `StudentDatabase` uses a `HashMap` to store student records, providing efficient O(1) average-case lookup, insertion, and deletion.
* **Duplicate Roll Number Handling:**  `addStudent` method checks for existing roll numbers before adding a new student.
* **Input Validation:** The `main` method includes checks for valid mode selection and input formats (e.g., comma-separated courses).
* **Inheritance:** The `GraduateStudent` class demonstrates inheritance to represent a specialized type of student.
* **Polymorphism:** The use of `Student` as the type for the HashMap values, and adding instances of both `Student` and `GraduateStudent`, demonstrates polymorphism.


## Future Improvements

* **Data Persistence:** Currently, the data is stored in memory and lost when the application terminates. Implementing persistent storage (e.g., using files or a database) is crucial.
* **Enhanced User Interface:**  The current command-line interface could be replaced with a more user-friendly GUI.
* **Advanced Search Functionality:** Implementing search based on criteria other than roll number (e.g., name, course) would be beneficial.
* **Exception Handling:** More robust exception handling can be added for potential errors like incorrect input formats.
* **Data Validation:**  Add validation to the inputs, for example, checking for the format of roll number, length of name, valid semester range, etc.


This documentation provides a high-level overview of the project's architecture and functionalities. It aims to facilitate understanding for senior developers who might be involved in maintaining or extending this system.
