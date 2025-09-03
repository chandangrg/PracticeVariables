package practiceVariable;

public class Student {
    // Instance variables
    int studentId;
    String name;

    // Static variable shared among all students
    static String schoolName = "Greenwood High School";

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {
        // Create first student
        Student s1 = new Student();
        s1.studentId = 201;
        s1.name = "John";

        // Create second student
        Student s2 = new Student();
        s2.studentId = 202;
        s2.name = "Emma";

        // Both students share the same school name
        s1.displayStudent();
        System.out.println("--------------");
        s2.displayStudent();

        // Now change schoolName using one object
        Student.schoolName = "Riverdale Academy";

        System.out.println("\nAfter changing school name:");
        s1.displayStudent();
        System.out.println("--------------");
        s2.displayStudent();
    }
}
