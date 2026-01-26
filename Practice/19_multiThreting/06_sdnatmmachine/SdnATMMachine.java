import java.lang.*;


class ATM
{
    synchronized public void CheakBalance(String name)
    {
        System.out.println(name+" has cheaked his/her Balane.");
        try{Thread.sleep(1000);}catch(Exception e){}
    }
    synchronized public void WithDraw(String name,int amount)
    {
        System.out.println(" Amount withdraw by "+name+":"+amount);
        try{Thread.sleep(1000);}catch(Exception e){}
    }
}

class Customer extends Thread
{
    ATM atm;
    String name;
    int amount;

    Customer(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }

    public void useATM()
    {
        atm.CheakBalance(name);
        atm.WithDraw(name,amount);
    }
    public void run()
    {
        useATM();
    }
}


public class SdnATMMachine
{

    public static void main(String args[])
    {
        ATM atm=new ATM();
        Customer c1=new Customer("Chandan",atm,25000);
        Customer c2=new Customer("Rahul",atm,55000);

        c1.start();
        c2.start();
    }
}