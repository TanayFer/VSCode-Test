/* Program for multiple threads with sleep mehthod. */

class MyThread extends Thread
{
  String message;
  MyThread(String message)
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
                Thread.sleep(5000);     //Sleep for 5 seconds
            }
       }
    catch (InterruptedException ie) { }
   }
}

public class MultipleThreadSleep
{
    public static void main(String[] args)
     {
        MyThread tl = new MyThread("Hello");
        MyThread t2 = new MyThread("Goodbye");
        System.out.println(tl);
        System.out.println(t2);
        tl.start();
       t2.start();
    }
}

