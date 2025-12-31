import java.lang.*;

class Account
{

    private String accNo;
    private String name;
    private String address;
    private String phn;
    private String dob;
    protected double balance;


    // constructor

    public Account() {
        balance = 0;
    }
    public Account(String acc,String n,String add,String phn,String dob)
    {
        accNo=acc;
        name=n;
        setAddress(add);
        setPhno(phn);
        this.dob=dob;
        balance=0;
    }




    // get & set methods

    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhn(){return phn;}
    public String getDOB(){return dob;}
    public double getBalance(){return balance;}
    

    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String ph)
    {
        phn=ph;
    }


}

class SavingAccount extends Account
{

    public double deposit(long amt)
    {
        balance+=amt;
        return balance;
    }

    public double withdraw(long amt)
    {
        balance-=amt;
        return balance;
    }

    public double fixDeposit()
    {
        double fdAmount = 10000;
        if(balance >= fdAmount) {
            balance -= fdAmount;
            return fdAmount;
        } else {
            return 0; // Not enough balance
        }
    }

    public double liquiDate()
    {
         double fdAmount = 10000;
        double interest = fdAmount * 0.05;
        balance += fdAmount + interest;
        return fdAmount + interest;
    }
    

}


class LoanAccount extends Account
{

     public double rePayment(long amt)
    {
        balance-=amt;
        return balance;
    }

    public double payEMI(long amt)
    {
        if(balance==amt)
        {
            balance=0;
        }
        else
        {
            balance -= amt;
        }
            return balance;
    }

    public double topUploan()
    {
        double topUpAmount = 5000;
        balance += topUpAmount;
        return balance;
    }
}


public class Account1
{

    public static void main(String[] args)
    {
        
        Account acc = new Account("A123", "Arjun", "Bangalore", "1234567890", "01-01-2000");
        System.out.println("Account Name: " + acc.getName());

    }
}
       

