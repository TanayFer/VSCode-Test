/* To create the thread and to demonstrate use of sleep() Method.  */
class SleepThread extends Thread 
{
    public void run() 
   {
        for(int i = 1; i <= 5; i++)
      {
          System.out.println(i);
         try 
           {
                Thread.sleep(1000);   // Pause for 1 second
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
        SleepThread t = new SleepThread();
        t.start();
    }
}
