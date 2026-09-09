/* Q 5. Implement a bank account simulation — multiple threads perform deposits and withdrawals; demonstrate the race condition first,
 then fix it with synchronisation; show correct final balance */ 


class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // UNSYNCHRONIZED - Race condition
    public void withdrawUnsafe(int amount) {

        if (balance >= amount) {

            System.out.println(
                Thread.currentThread().getName() + " withdrawing " + amount
            );

            // Deliberately create a chance for race condition
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance = balance - amount;
        }
    }

    // SYNCHRONIZED - Race condition fixed
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

        // =====================================================
        // PART 1: RACE CONDITION
        // =====================================================

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


        // =====================================================
        // PART 2: SYNCHRONIZATION
        // =====================================================

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