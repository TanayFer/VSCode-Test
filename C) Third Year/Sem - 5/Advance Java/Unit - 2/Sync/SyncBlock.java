/* Program for Synchronized Block. */
class Display
{
    void show(String msg) 
     {
        synchronized(this) 
       {
            for(int i=1;i<=3;i++)
           {
                System.out.println(msg);
            }
        }
    }
}

public class SyncBlock 
{
    public static void main(String args[]) 
   {
        Display d=new Display();
        new Thread(() -> d.show("Hello")).start();
        new Thread(() -> d.show("Java")).start();
    }
}

