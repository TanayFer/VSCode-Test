class Example1Thread extends Thread
 {
    public void run() 
    {
        System.out.println("Thread is running...");
    }
}

public class ThreadExample1 
{
    public static void main(String[] args) 
   {
        Example1Thread t1 = new Example1Thread();
        t1.start();    
    }
}
