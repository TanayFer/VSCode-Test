/* Program to square a number using Chain Asynchronous operations. */
import java.util.concurrent.*;

class SquareDemo
{
    public static void main(String args[]) throws Exception
    {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 10)
                                 .thenApply(n -> n * n);

        System.out.println("Square = " + future.get());
    }
}
