package practiceVariable;

class CollegeStudent {
    int studentId;
    String studentName;
    static String collegeName = "NY University"; // shared by all students

    public CollegeStudent(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    public void displayStudent() {
        System.out.println("ID: " + studentId + ", Name: " + studentName + ", College: " + collegeName);
    }

    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent(1, "Alice");
        CollegeStudent s2 = new CollegeStudent(2, "Bob");
        s1.displayStudent();
        s2.displayStudent();
    }
}