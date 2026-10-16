class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdrawUnsafe(int amount) {

        if (balance >= amount) {

            System.out.println(
                Thread.currentThread().getName() + " withdrawing " + amount
            );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance = balance - amount;
        }
    }

    public synchronized void withdrawSafe(int amount) {

        if (balance >= amount) {

            System.out.println(
                Thread.currentThread().getName()+ " withdrawing " + amount
            );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance = balance - amount;

        } else {

            System.out.println(
                Thread.currentThread().getName() + " cannot withdraw " + amount + " - Insufficient balance"
            );
        }
    }

    public int getBalance() {
        return balance;
    }
}


public class BankAccountSimulation {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("===== RACE CONDITION =====");

        BankAccount account1 = new BankAccount(1000);

        Thread t1 = new Thread(() -> {
            account1.withdrawUnsafe(700);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account1.withdrawUnsafe(700);
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
            "Final Balance (Unsafe): "
            + account1.getBalance()
        );

        System.out.println("\n===== SYNCHRONIZATION =====");

        BankAccount account2 = new BankAccount(1000);

        Thread t3 = new Thread(() -> {
            account2.withdrawSafe(700);
        }, "Thread-3");

        Thread t4 = new Thread(() -> {
            account2.withdrawSafe(700);
        }, "Thread-4");

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(
            "Final Balance (Safe): "
            + account2.getBalance()
        );
    }
}