The documentation generated for senior is as follows:

# IIT Tirupati Student Database - Senior Developer Documentation

## Overview

This Java project implements a student database management system using object-oriented principles.  It allows for adding, updating, deleting, and viewing student records, differentiating between undergraduate and graduate students. The system utilizes core Java concepts like inheritance, polymorphism, and data structures such as `HashMap` and `ArrayList`.

## Dependencies

This project uses only core Java libraries, with no external dependencies.  Key data structures utilized include `java.util.HashMap` for storing student records (keyed by roll number) and `java.util.ArrayList` for managing student courses.

## Architecture

The project employs a simple three-tier architecture:

1. **Data Model:** The `Student` class represents the base data model for students, encapsulating attributes like name, roll number, semester, courses, and faculty advisor. The `GraduateStudent` class extends the `Student` class using inheritance, demonstrating polymorphism by overriding the `toString()` method.

2. **Data Access:** The `StudentDatabase` class handles database operations like adding, updating, deleting, and viewing students. It internally uses a `HashMap` to store and retrieve student records by roll number.

3. **User Interface:** The `Viva` class contains the `main` method and provides a command-line interface for interacting with the student database. It offers both admin and user modes with different levels of access.

## Critical Logic

* **Inheritance and Polymorphism:** The `GraduateStudent` class extends `Student`, showcasing inheritance. The `toString()` method is overridden in both classes, illustrating polymorphism.

```java
class GraduateStudent extends Student { ... }
@Override
public String toString() { ... }
```

* **HashMap for Efficient Storage:** The `StudentDatabase` class uses a `HashMap` to store student data, enabling efficient retrieval using the roll number as the key.

```java
public HashMap<String, Student> database;
database.put(student.rollNumber, student); //Adding a student to the database
```

* **Input Validation:** Basic input validation is performed, such as checking for duplicate roll numbers during student addition.

```java
if (database.containsKey(student.rollNumber)) {
    System.out.println("Error: Roll number already exists!");
}
```

* **Admin and User Modes:** The system offers two distinct modes of operation: admin mode (for adding, updating, and deleting students) and user mode (for viewing student details).  This separation provides basic access control.


## Key Functionalities

* **Add Student:** Adds a new student (undergraduate or graduate) to the database.
* **Update Student:** Modifies the details of an existing student.
* **Delete Student:** Removes a student record from the database.
* **View Student:** Retrieves and displays the information of a specific student.


## Future Improvements

* **Enhanced Data Persistence:**  Currently, data is stored in memory and lost upon program termination. Implementing a persistent storage mechanism (e.g., file storage or a database) would be beneficial.
* **Improved User Interface:**  The command-line interface could be replaced with a more user-friendly graphical user interface (GUI).
* **Advanced Search and Filtering:**  Adding functionality to search and filter students based on various criteria (e.g., name, semester, courses) would enhance usability.
* **Exception Handling:** Implementing robust exception handling would improve the application's stability and error management.

## Test Run

The commit message "test run 1" suggests initial testing has been conducted. Further comprehensive testing is recommended to ensure all functionalities work as expected and to identify potential edge cases.
