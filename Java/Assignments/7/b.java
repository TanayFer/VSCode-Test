//Design a BankAccount class with private accountNumber, balance, and 
//public methods to deposit, withdraw, and view balance.
import java.util.Scanner;
public class b {
    private String accountNumber;
    private double balance;

    public b(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    public void viewBalance() {
        System.out.printf("Account Number: %s%n", accountNumber);
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = s1.nextLine();

        System.out.print("Enter Opening Balance: ");
        double openingBalance = s1.nextDouble();

        b account = new b(accNo, openingBalance);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = s1.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depAmt = s1.nextDouble();
                    account.deposit(depAmt);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wdAmt = s1.nextDouble();
                    account.withdraw(wdAmt);
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    System.out.println("Boiiii Boiiiiiiiiii");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        s1.close();
    }
}