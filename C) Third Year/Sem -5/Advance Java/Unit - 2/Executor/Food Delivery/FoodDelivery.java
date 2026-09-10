import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FoodOrder implements Runnable {

    private int orderId;
    private String customerName;

    public FoodOrder(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        System.out.println(
            "Processing Order " + orderId +
            " for " + customerName +
            " by " + Thread.currentThread().getName()
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
            "Order " + orderId + " completed."
        );
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        ExecutorService service =
            Executors.newFixedThreadPool(3);

        System.out.println("\nEnter order details:");

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Order ID: ");
            int orderId = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Customer Name: ");
            String customerName = sc.nextLine();

            service.submit(
                new FoodOrder(orderId, customerName)
            );
        }
        service.shutdown();

        sc.close();
    }
}
