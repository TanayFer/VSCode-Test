public class MyThread extends Thread{
    public void run()
    {
        System.out.println("New Thread Running");
    }
    public static void main(String[] args) {
        System.out.println("Main thread Running");
        MyThread th = new MyThread();
        Thread t = new Thread(th);
        t.start();
    }
}
