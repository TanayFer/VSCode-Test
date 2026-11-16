class Inventory {
    private int stock = 5;

    public synchronized boolean purchase(String customerName, int quantity) {
        if (stock >= quantity) {
            System.out.println(customerName + " successfully purchased " + quantity + " item(s).");
            stock -= quantity;
            System.out.println("Remaining stock: " + stock);
            return true;
        } else {
            System.out.println(customerName + " failed to purchase. Insufficient stock!");
            return false;
        }
    }
}

public class InventorySystemTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Runnable customerTask = () -> {
            inventory.purchase(Thread.currentThread().getName(), 2);
        };

        Thread t1 = new Thread(customerTask, "Customer-A");
        Thread t2 = new Thread(customerTask, "Customer-B");
        Thread t3 = new Thread(customerTask, "Customer-C");

        t1.start();
        t2.start();
        t3.start();
    }
}