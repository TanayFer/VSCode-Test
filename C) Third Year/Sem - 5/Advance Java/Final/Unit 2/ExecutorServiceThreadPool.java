import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " executed by thread: " + Thread.currentThread().getName());
            });
        }

        // Shut down the executor after tasks finish
        executor.shutdown();
    }
}