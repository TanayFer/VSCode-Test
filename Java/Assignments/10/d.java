abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCard extends Payment {
    private String cardNumber;
    
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
    private String upiId;
    
    public UPI(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
        System.out.println("UPI ID: " + upiId);
    }
}