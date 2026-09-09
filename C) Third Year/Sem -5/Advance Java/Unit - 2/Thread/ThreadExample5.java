/*  To demonstrate the use of  join() method. */
class MyThread extends Thread 
{
     public void run() 
   {
            for(int i = 1; i <= 5; i++) 
           {
                System.out.println("Child Thread : " + i);
            }
    }
}

public class ThreadExample5 
{
     public static void main(String[] args) throws Exception 
     {
        MyThread t = new MyThread();
        t.start();
        t.join();   // Wait until child thread finishes
        System.out.println("Main Thread Ends");
    }
}
