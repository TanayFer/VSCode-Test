/* To demonstrate the use of two Threads Running Simultaneously. 
A Java program to demonstrate the use of different Thread constructors. To demonstrate the use of two Threads Running Simultaneously. Both thread print numbers 1 to 5 concurrently. To demonstrate that the sequence of the printing numbers from both threads may shuffle every time the program executes. */
/* Program to demonstrate the use of two threads running simultaneously. */

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

class Thread2 extends Thread 
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
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

