/* Program to set the Threat Priority. */
class MyThread extends Thread 
{
    public void run() 
    {
        System.out.println(getName() + " Priority = " + getPriority());
    }
}

public class SetPriority
{
    public static void main(String[] args) 
  {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Thread A");
        t2.setName("Thread B");
        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.MIN_PRIORITY);   // 1
        t1.start();
        t2.start();
    }
}

