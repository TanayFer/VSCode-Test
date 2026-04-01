import java.util.Scanner;

public class c {
    private final String loanId;
    private final String borrowerName;
    private final double principalAmount;
    private final double interestRate;

    public c(String loanId, String borrowerName, double principalAmount, double interestRate) {
        this.loanId = loanId;
        this.borrowerName = borrowerName;
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
    }

    public double calculateTotalRepayment(int years) {
        // Simple interest calculation
        double interest = principalAmount * interestRate * years / 100;
        return principalAmount + interest;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Loan ID: ");
            String loanId = sc.nextLine();

            System.out.print("Enter Borrower Name: ");
            String borrowerName = sc.nextLine();

            System.out.print("Enter Principal Amount: ");
            double principalAmount = sc.nextDouble();

            System.out.print("Enter Interest Rate (%): ");
            double interestRate = sc.nextDouble();

            c loan = new c(loanId, borrowerName, principalAmount, interestRate);

            System.out.print("Enter Number of Years: ");
            int years = sc.nextInt();

            double totalRepayment = loan.calculateTotalRepayment(years);
            System.out.println("Loan ID: " + loan.loanId);
            System.out.println("Borrower Name: " + loan.borrowerName);
            System.out.println("Total Repayment after " + years + " years: " + totalRepayment);
        }
    }
}