import java.util.concurrent.*;

class MyTasks implements Runnable{
    public void run()
    {
        System.out.println("Tasks Perfomed by "+Thread.currentThread().getName());
    }
}

class ExecutorDemo2
{
    public static void main(String args[])
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        

        executor.execute(new MyTasks());
        executor.execute(new MyTasks());
        executor.execute(new MyTasks());
        executor.execute(new MyTasks());
        executor.execute(new MyTasks());

        executor.shutdown();
    }
}