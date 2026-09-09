/* Program to display the thread information. */
class Thread1 extends Thread 
{
     public void run() 
      {
        for(int i = 1; i <= 5; i++) 
       {
            System.out.println("Thread 1 : " + i);
        }
    }
}
public class ThreadInfo
{
    public static void main(String[] args)
 {
        Thread1 t1 = new Thread1();
        System.out.println(t1);   // Display thread information.
            t1.start();
       System.out.println("Hello Students....");
 
    }
}
