class Example3Thread1 extends Thread 
{
     public void run() 
      {
        for(int i = 1; i <= 5; i++) 
       {
            System.out.println("Thread 1 : " + i);
        }
    }
}

class Example3Thread2 extends Thread 
{
    public void run() 
   {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 : " + i);
        }
    }
}
public class ThreadExample3 
{
    public static void main(String[] args)
 {
        Example3Thread1 t1 = new Example3Thread1();
        Example3Thread2 t2 = new Example3Thread2();
        t1.start();
        t2.start();
    }
}

