import java.util.concurrent.*;

class MyTasks implements Runnable{
    public void run()
    {
        System.out.println("Tasks Perfomed by "+Thread.currentThread().getName());
    }
}

class ExecutorDemo1
{
    public static void main(String args[])
    {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        executor.execute(new MyTasks());
        executor.execute(new MyTasks());
        executor.execute(new MyTasks());
        executor.execute(new MyTasks());
        executor.execute(new MyTasks());

        executor.shutdown();
    }
}