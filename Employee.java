package practiceVariable;

public class Employee {
    // Instance variables
    int empId;
    String name;
    double salary;

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Main method to test
    public static void main(String[] args) {
        // Create first employee object
        Employee e1 = new Employee();
        e1.empId = 101;
        e1.name = "Alice";
        e1.salary = 55000;

        // Create second employee object
        Employee e2 = new Employee();
        e2.empId = 102;
        e2.name = "Bob";
        e2.salary = 60000;

        // Display details of both
        e1.displayDetails();
        System.out.println("----------------");
        e2.displayDetails();
    }
}
