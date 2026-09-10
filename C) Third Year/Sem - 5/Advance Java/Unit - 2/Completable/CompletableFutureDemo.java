import java.util.concurrent.*;

class CompletableFutureDemo
{
    public static void main(String args[]) throws Exception
    {
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync (() ->
                {        
                    return "Hello from Background Thread";    
                });
                    System.out.println(future.get() );
                
}
}
