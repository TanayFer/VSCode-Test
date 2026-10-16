import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncDataFetcher1 {

    // Simulate User Service
    static String fetchUserData() {
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "User service interrupted";
        }

        return "User: John Doe";
    }

    // Simulate Order Service
    static String fetchOrderData() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Order service interrupted";
        }

        return "Orders: [Order101, Order102]";
    }

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {

            Future<String> userFuture =
                    executor.submit(() -> fetchUserData());

            Future<String> orderFuture =
                    executor.submit(() -> fetchOrderData());

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

            String combinedData =
                    userData + "\n" + orderData;

            System.out.println(combinedData);

        } finally {

            executor.shutdown();
        }
    }
}