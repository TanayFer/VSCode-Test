import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> userFetcher = CompletableFuture.supplyAsync(() -> {
            // Simulate fetching user
            return "User: Alice";
        });

        CompletableFuture<String> orderFetcher = CompletableFuture.supplyAsync(() -> {
            // Simulate fetching order details
            return "Order: Laptop (#1092)";
        });

        CompletableFuture<String> combined = userFetcher.thenCombine(orderFetcher, (user, order) -> {
            return user + " | " + order;
        });

        System.out.println("Consolidated Report: " + combined.get());
    }
}