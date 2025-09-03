package practiceVariable;

class Student1 {
    String name;
    int mark1, mark2, mark3;

    public Student1(String name, int m1, int m2, int m3) {
        this.name = name;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    public void calculateAverage() {
        int sum = mark1 + mark2 + mark3; // local variable
        double average = sum / 3.0;      // local variable
        System.out.println(name + "'s Average Marks: " + average);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("Liam", 85, 90, 80);
        s1.calculateAverage();
    }
}
