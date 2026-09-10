class InfoThread extends Thread 
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
        InfoThread t1 = new InfoThread();
        System.out.println(t1);  
            t1.start();
       System.out.println("Hello Students....");
 
    }
}
