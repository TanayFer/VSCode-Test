import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncDataFetcher {

    // Simulate User Service
    static CompletableFuture<String> fetchUserData() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }



            return "User: John Doe";
        });
    }

    static CompletableFuture<String> fetchOrderData() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


            return "Orders: [Order101, Order102]";
        });
    }

    public static void main(String[] args) {

        CompletableFuture<String> userFuture = fetchUserData();
        CompletableFuture<String> orderFuture = fetchOrderData();

        // Combine results after both services complete
        CompletableFuture<String> combinedFuture =
                userFuture.thenCombine(orderFuture,
                        (userData, orderData) ->
                                userData + "\n" + orderData
                )
                .exceptionally(ex -> {
                    return "Error: Failed to fetch data. Reason: "
                            + ex.getMessage();
                });

        try {
            String result = combinedFuture.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Operation interrupted.");
        } catch (ExecutionException e) {
            System.out.println("Unexpected error: " + e.getCause());
        }
    }
}