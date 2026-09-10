class Example4SleepThread extends Thread 
{
    public void run() 
   {
        for(int i = 1; i <= 5; i++)
      {
          System.out.println(i);
         try 
           {
                Thread.sleep(1000);
             }
         catch(InterruptedException e) 
          {
                 System.out.println(e);
            }
     }
   }
}

public class ThreadExample4 
{
    public static void main(String[] args) 
    {
        Example4SleepThread t = new Example4SleepThread();
        t.start();
    }
}
