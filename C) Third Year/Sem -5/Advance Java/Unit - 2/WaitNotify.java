/* Program for  wait() and notify(). */
class Customer 
{
    int amount=1000;
    synchronized void withdraw(int amt) 
    {
        if(amount<amt) 
         {
            System.out.println("Waiting for deposit...");
            try 
           {
                wait();
            } 
            catch(Exception e) {}
        }

        amount-=amt;
        System.out.println("Withdraw Successful     " + amount);
    }

    synchronized void deposit(int amt) 
    {
        amount+=amt;
        System.out.println("Amount Deposited. Total Balance   " + amount );
        notify();
    }
}

public class WaitNotify 
{
    public static void main(String args[]) 
   {
        Customer c=new Customer();
        new Thread(() -> c.withdraw(1500)).start();
        new Thread(() -> c.deposit(1000)).start();
    }
}
