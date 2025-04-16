import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    protected String name;
    protected String rollNumber;
    protected int semester;
    protected ArrayList<String> courses;
    protected String facultyAdvisor;

    public Student(String name, String rollNumber, int semester, ArrayList<String> courses, String facultyAdvisor) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.semester = semester;
        this.courses = courses;
        this.facultyAdvisor = facultyAdvisor;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Roll Number: " + rollNumber + "\n" + "Semester: " + semester + "\n" + "Courses: " + String.join(", ", courses) + "\n" + "Faculty Advisor: " + facultyAdvisor;
    }
}
//this class which I created is using inheritance (which means it is inheriting the attributes of the parent class Student)
class GraduateStudent extends Student {
    public GraduateStudent(String name, String rollNumber, int semester, ArrayList<String> courses, String facultyAdvisor) {
        super(name, rollNumber, semester, courses, facultyAdvisor);
    }

    @Override
    public String toString() {
        return "Graduate Student Details:\n" + super.toString();
    }
}

class StudentDatabase {
    public HashMap<String, Student> database;

    public StudentDatabase() {
        database = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (database.containsKey(student.rollNumber)) {
            System.out.println("Error: Roll number already exists!");
        } else {
            database.put(student.rollNumber, student);
            System.out.println("Student added successfully!");
        }
    }

    public void updateStudent(String rollNumber, Student updatedStudent) {
        if (database.containsKey(rollNumber)) {
            database.put(rollNumber, updatedStudent);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Error: Student with Roll Number " + rollNumber + " not found.");
        }
    }

    public void deleteStudent(String rollNumber) {
        if (database.containsKey(rollNumber)) {
            database.remove(rollNumber);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Error: Student with Roll Number " + rollNumber + " not found.");
        }
    }

    public void viewStudent(String rollNumber) {
        if (database.containsKey(rollNumber)) {
            System.out.println(database.get(rollNumber));
        } else {
            System.out.println("Error: Student with Roll Number " + rollNumber + " not found.");
        }
    }

    public boolean studentExists(String rollNumber) {
        return database.containsKey(rollNumber);
    }
}

public class Viva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase studentDatabase = new StudentDatabase();

        while (true) {
            System.out.println("\n--- IIT Tirupati Student Database ---");
            System.out.println("1. Admin Mode");
            System.out.println("2. User Mode");
            System.out.println("3. Exit");
            System.out.print("Choose mode: ");
            int mode = scanner.nextInt();
            scanner.nextLine();

            if (mode == 1) {
                System.out.println("\n--- Admin Mode ---");
                System.out.println("1. Add Undergraduate Student");
                System.out.println("2. Add Graduate Student");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.print("Choose operation: ");
                int adminChoice = scanner.nextInt();
                scanner.nextLine();

                switch (adminChoice) {
                    case 1 -> {
                        // Add Undergraduate Student
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Roll Number: ");
                        String rollNumber = scanner.nextLine();
                        System.out.print("Enter Semester: ");
                        int semester = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Courses (comma separated): ");
                        String[] coursesArray = scanner.nextLine().split(",");
                        ArrayList<String> courses = new ArrayList<>();
                        for (String course : coursesArray) {
                            courses.add(course.trim());
                        }
                        System.out.print("Enter Faculty Advisor: ");
                        String facultyAdvisor = scanner.nextLine();

                        Student newStudent = new Student(name, rollNumber, semester, courses, facultyAdvisor);
                        studentDatabase.addStudent(newStudent);
                    }
                    case 2 -> {
                        // Add Graduate Student
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Roll Number: ");
                        String rollNumber = scanner.nextLine();
                        System.out.print("Enter Semester: ");
                        int semester = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Courses (comma separated): ");
                        String[] coursesArray = scanner.nextLine().split(",");
                        ArrayList<String> courses = new ArrayList<>();
                        for (String course : coursesArray) {
                            courses.add(course.trim());
                        }
                        System.out.print("Enter Faculty Advisor: ");
                        String facultyAdvisor = scanner.nextLine();

                        GraduateStudent newGraduateStudent = new GraduateStudent(name, rollNumber, semester, courses, facultyAdvisor);
                        studentDatabase.addStudent(newGraduateStudent);
                    }
                    case 3 -> {
                        // Update Student
                        System.out.print("Enter Roll Number of Student to Update: ");
                        String rollNumber = scanner.nextLine();
                        if (!studentDatabase.studentExists(rollNumber)) {
                            System.out.println("Error: Student with Roll Number " + rollNumber + " not found.");
                            continue;
                        }

                        System.out.print("Enter New Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter New Semester: ");
                        int semester = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Courses (comma separated): ");
                        String[] coursesArray = scanner.nextLine().split(",");
                        ArrayList<String> courses = new ArrayList<>();
                        for (String course : coursesArray) {
                            courses.add(course.trim());
                        }
                        System.out.print("Enter New Faculty Advisor: ");
                        String facultyAdvisor = scanner.nextLine();

                        Student updatedStudent = new Student(name, rollNumber, semester, courses, facultyAdvisor);
                        studentDatabase.updateStudent(rollNumber, updatedStudent);
                    }
                    case 4 -> {
                        System.out.print("Enter Roll Number of Student to Delete: ");
                        String rollNumber = scanner.nextLine();
                        studentDatabase.deleteStudent(rollNumber);
                    }
                    default -> System.out.println("Invalid choice! Try again.");
                }

            } else if (mode == 2) {
                System.out.println("\n--- User Mode ---");
                System.out.print("Enter Roll Number to View Student: ");
                String rollNumber = scanner.nextLine();
                studentDatabase.viewStudent(rollNumber);

            } else if (mode == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid mode! Try again.");
            }
        }

        scanner.close();
    }
}
