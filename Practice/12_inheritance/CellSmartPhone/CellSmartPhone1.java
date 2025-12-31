import java.lang.*;

class CellPhone
{
    // Properties
    private String phno;
    private long imie;

    // Constructor
    public  CellPhone(long Imie)
    {
        imie=Imie;
    }
    public  CellPhone(String Phno,long Imie)
    {
        setPhno(Phno);
        imie=Imie;
    }

    // set&get method
    public String getPhno(){return phno;}
    public long getImie(){return imie;}

    public void setPhno(long phn)
    {
        phno=phn;
    }

    // Methods
    
    public String sall()
    { 
        return 
    }
    public String sms()
    { 
        return 
    }
    public String saveContect()
    { 
        return 
    }
    public String deleteContect()
    { 
        return 
    }
}

class SmartPhone extends CellPhone
{

    // Properties
    private long mac;

    // Constructor


    // set&get method


    // Methods
}


public class CellSmartPhone1
{

    public static void main(String[] args)
    {

    }
}