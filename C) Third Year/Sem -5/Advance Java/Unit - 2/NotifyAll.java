/* Program to demonstrate NotifyAll() method. */
class Test 
{
    synchronized void waiting() 
   {
        try 
        {
            System.out.println(Thread.currentThread().getName()+" Waiting");
            wait();
        }
        catch(Exception e){}
    }

    synchronized void wakeup() 
   {
        notifyAll();
        System.out.println("All Threads Notified");
    }
}

public class NotifyAll 
{
    public static void main(String args[]) 
   { 
        Test t=new Test();
        new Thread(() -> t.waiting(),"T1").start();
        new Thread(() -> t.waiting(),"T2").start();
        try 
        {
            Thread.sleep(1000);
        } catch(Exception e){}

        new Thread(() -> t.wakeup()).start();
    }
}
