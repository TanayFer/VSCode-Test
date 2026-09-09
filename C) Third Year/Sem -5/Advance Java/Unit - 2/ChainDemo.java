/* Program to demonstarte Chain Asynchronous Operations. */
import java.util.concurrent.*;

class ChainDemo
{
    public static void main(String args[]) throws Exception
    {
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> "Java")
                                 .thenApply(s -> s + " Programming")
                                 .thenApply(s -> s + " Language");

        System.out.println(future.get());
    }
}
