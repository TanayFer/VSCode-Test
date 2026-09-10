class Example5Thread extends Thread 
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
        Example5Thread t = new Example5Thread();
        t.start();
        t.join();  
        System.out.println("Main Thread Ends");
    }
}
