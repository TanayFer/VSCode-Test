/* Program to demonstrate CompletableFuture, thenAccept and thenCombine. */
import java.util.concurrent.*;

public class thenCombineDemo
{
    public static void main(String args[]) throws Exception
    {
      CompletableFuture<Integer> f1=
      CompletableFuture.supplyAsync(()->10);

      CompletableFuture<Integer> f2=
      CompletableFuture.supplyAsync(()->20);

      f1.thenCombine(f2,(a,b)->a+b)
      .thenAccept(System.out::println);
    } 
}
