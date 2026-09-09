/* Program 2: To create a Thread by Implementing Runnable Interface */
class MyRunnable implements Runnable 
 {
    public void run() 
    {
        System.out.println("Runnable thread is running...");
    }

    public static void main(String[] args) 
    {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
        System.out.println("Main thread executed.");
    }
}

