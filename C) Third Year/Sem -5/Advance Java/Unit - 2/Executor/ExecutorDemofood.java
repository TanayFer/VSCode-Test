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
            Thread.sleep(2000); // Simulating order processing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
            "Order " + orderId + " completed."
        );
    }
}

public class ExecutorDemofood {

    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(2);

        System.out.println("Using Executor:");

        executor.execute(
            new FoodOrder(101, "Rahul")
        );

        executor.execute(
            new FoodOrder(102, "Priya")
        );

        executor.execute(
            new FoodOrder(103, "Amit")
        );

        ExecutorService service =
            Executors.newFixedThreadPool(3);

        System.out.println("\nUsing ExecutorService:");

        service.submit(
            new FoodOrder(201, "John")
        );

        service.submit(
            new FoodOrder(202, "David")
        );

        service.submit(
            new FoodOrder(203, "Sarah")
        );

        service.shutdown();
    }
}
