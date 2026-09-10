class SleepMessageThread extends Thread
{
  String message;
   SleepMessageThread(String message)
    { 
         this.message= message;
       }

    public void run()
    {
       try
       {
   	 for (int i=1;i<=5;i++)
           {
       	     System.out.println(message + "-" + i);
               Thread.sleep(5000);
            }
       }
    catch (InterruptedException ie) { }
   }
}

public class MultipleThreadSleep
{
    public static void main(String[] args)
     {
      SleepMessageThread tl = new SleepMessageThread("Hello");
      SleepMessageThread t2 = new SleepMessageThread("Goodbye");
        System.out.println(tl);
        System.out.println(t2);
        tl.start();
       t2.start();
    }
}

