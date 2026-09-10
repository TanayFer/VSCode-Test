import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncDataFetcher1 {

    // Simulate User Service
    static String fetchUserData() {
        try {
            Thread.sleep(2000); // Simulate 2-second API call
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "User service interrupted";
        }

        return "User: John Doe";
    }

    // Simulate Order Service
    static String fetchOrderData() {
        try {
            Thread.sleep(1500); // Simulate 1.5-second API call
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Order service interrupted";
        }

        return "Orders: [Order101, Order102]";
    }

    public static void main(String[] args) {

        // Create a thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {

            // Start User Service asynchronously
            Future<String> userFuture =
                    executor.submit(() -> fetchUserData());

            // Start Order Service asynchronously
            Future<String> orderFuture =
                    executor.submit(() -> fetchOrderData());

            // Get results
            String userData;
            String orderData;

            try {
                userData = userFuture.get();
            } catch (Exception e) {
                userData = "Error fetching user data: " + e.getMessage();
            }

            try {
                orderData = orderFuture.get();
            } catch (Exception e) {
                orderData = "Error fetching order data: " + e.getMessage();
            }

            // Combine the results
            String combinedData =
                    userData + "\n" + orderData;

            // Display result
            System.out.println(combinedData);

        } finally {

            // Shut down the executor
            executor.shutdown();
        }
    }
}