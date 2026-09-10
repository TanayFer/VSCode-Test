/* Program to demonstrate Asynchronous Programming. */
import java.util.concurrent.*;

class AsyncDemo
{
    public static void main(String args[])
    {
        CompletableFuture.runAsync(() ->
        {
            System.out.println("Background Task Running...");
        });

        System.out.println("Main Thread continues...");

        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }
}

