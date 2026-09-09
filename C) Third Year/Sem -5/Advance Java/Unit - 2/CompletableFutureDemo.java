/* Program to demonstrate CompletableFuture */
import java.util.concurrent.*;

class CompletableFutureDemo
{
    public static void main(String args[]) throws Exception
    {
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() ->
                {        // beginning of the lambda expression.  
                    return "Hello from Background Thread";    // background task returns the task
			// This returned value becomes the result stored in the CompletableFuture.
        System.out.println(future.get() );
    }
}

