package practiceVariable;

class Employee1 {
    int empId;
    String name;
    double salary;
    static int totalEmployees = 0;
    static double totalSalaryExpense = 0;

    public Employee1(int id, String name, double salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    public void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: $" + salary);
    }

    public static void displaySummary() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary Expense: $" + totalSalaryExpense);
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1(1, "John", 5000);
        Employee1 e2 = new Employee1(2, "Emma", 6000);
        e1.displayEmployee();
        e2.displayEmployee();
        Employee1.displaySummary();
    }
}
