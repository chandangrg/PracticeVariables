package practiceVariable;

public class LocalVariablePractice {
    // Method to add two integers using local variables
    public int addNumbers(int a, int b) {
        int num1 = a;  // local variable
        int num2 = b;  // local variable
        int sum = num1 + num2; // local variable
        return sum;
    }

    public static void main(String[] args) {
        LocalVariablePractice obj = new LocalVariablePractice();
        int result = obj.addNumbers(10, 20);
        System.out.println("Sum = " + result);
    }
}
