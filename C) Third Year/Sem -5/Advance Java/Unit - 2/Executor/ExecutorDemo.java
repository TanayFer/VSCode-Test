/* Program to demonstrate Executor Framework that simplifies multithreading. */
import java.util.concurrent.*;

class MyTask implements Runnable
{
    public void run()
    {
        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}

class ExecutorDemo
{
    public static void main(String args[])
    {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new MyTask());
        executor.execute(new MyTask());

        executor.shutdown();
    }
}
