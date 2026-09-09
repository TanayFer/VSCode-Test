abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCard extends Payment {
    private final String cardNumber;
    
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card: " + cardNumber);
    }
}

class UPI extends Payment {
    private final String upiId;
    
    public UPI(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
        System.out.println("UPI ID: " + upiId);
    }
}

public class d {
    public static void main(String[] args) {
        Payment cardPayment = new CreditCard("4111-1111-1111-1111");
        Payment upiPayment = new UPI("user@upi");

        cardPayment.processPayment(2500.0);
        System.out.println();
        upiPayment.processPayment(1200.0);
    }
}