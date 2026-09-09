// Parent class
class Bank {
    public double getInterestRate() {
        return 0;
    }
}

// Subclass
class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 7;
    }
}

// Main class to demonstrate method call
public class a {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate());
        
        Bank bank = new SBI();
        System.out.println("Bank Interest Rate: " + bank.getInterestRate());
    }
}