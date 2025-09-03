package practiceVariable;

public class BankAccount {
    // Instance variables
    int accountNumber;
    String accountHolderName;
    double balance;

    // Method to deposit money
    public void deposit(double amount) {
        // Local variable to calculate new balance
        double newBalance = balance + amount;
        balance = newBalance; // update instance variable
        System.out.println(amount + " deposited successfully.");
        System.out.println("Updated Balance: " + balance);
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 1001;
        acc1.accountHolderName = "Alice";
        acc1.balance = 500.0;

        // Show account before deposit
        acc1.displayAccount();

        System.out.println("\nDepositing money...");
        acc1.deposit(250.0); // Deposit using local variable

        System.out.println("\nFinal Account Details:");
        acc1.displayAccount();
    }
}
