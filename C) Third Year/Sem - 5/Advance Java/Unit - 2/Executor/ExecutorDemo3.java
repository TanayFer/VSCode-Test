import java.util.concurrent.*;

class MyTasks implements Runnable{
    public void run()
    {
        System.out.println("Tasks Perfomed by "+Thread.currentThread().getName());
    }
}

class ExecutorDemo3
{
    public static void main(String args[])
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0;i<3;i++)
        {
            executor.execute(new MyTasks());
        }
        executor.shutdown();
    }
}