The documentation generated for novice is as follows:

# IIT Tirupati Student Database - Novice Developer Documentation

This project is a simple student database program built using Java. It lets you add, update, delete, and view student information like their name, roll number, semester, courses, and faculty advisor.  The program uses object-oriented programming (OOP) which helps organize the code into reusable pieces.

## What the code does

Imagine a digital record book for students. This program does something similar. It keeps track of student information and lets you do different things with it, like adding new students, updating existing records, removing students, and viewing student details.

## How it works

The program is divided into a few main parts:

* **Student:** This is like a template for storing information about a single student.  It holds things like the student's name, roll number, what semester they're in, their courses, and their faculty advisor.  There's also a special type of student, a *Graduate Student*, which is based on this template but might have some extra information in the future.

* **StudentDatabase:** This is like the main record book.  It stores all the `Student` information, organized by roll number so it's easy to find a specific student.  This part handles adding new students, updating their info, deleting records, and displaying information when you need it.

* **Viva:** This part runs the whole program. It shows you a menu with options to choose from (like adding a student, viewing details, etc.). It takes your input and then tells the `StudentDatabase` what to do.  It also has different modes, one for admins who can add, update, and delete students, and another for regular users who can only view student information.

## Important Concepts

* **Classes and Objects:** Think of a "class" as a blueprint (like the `Student` blueprint). An "object" is a specific instance created from that blueprint (like a record for a particular student).

* **HashMap:** This is used in `StudentDatabase` to store students.  It's like a dictionary where you can quickly look up a student using their roll number.

* **Inheritance:** The `GraduateStudent` is based on the `Student` class. This means it automatically has all the same properties as a regular student (name, roll number, etc.), but you can add more specific things for graduate students later.

* **Input Handling:** The `Viva` class uses a `Scanner` to get input from the user (like the student's name or roll number).

* **Error Handling:**  The code has some basic checks, for example, it makes sure you don't add a student with the same roll number twice.

The program keeps running until you choose to exit. It uses simple text menus to make it easy to use.  It doesn't have any special external libraries or frameworks – just standard Java stuff.
