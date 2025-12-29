import java.lang.*;


class Product
{

    private String itemno;
    private String name;
    private double price;
    private short qty;


    public Product(String itemNo)
    {
        itemno=itemNo;
    }
    public Product(String itemNo,String name)
    {
        itemno=itemNo;
        this.name=name;
    }
    public Product(String itemNo,String name,double price,short qty)
    {
        itemno=itemNo;
        this.name=name;
        setPrice(price);
        setQty(qty);
    }


    public String getItemno()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public short getQty()
    {
        return qty;
    }


    public void setPrice(double prc)
    {
        if(prc>0)
        {
            price=prc;
        }
        else
        {
            price=0;
        }
    }
    public void setQty(short qt)
    {
        if(qt>0)
        {
            qty=qt;
        }
        else
        {
            qty=0;
        }
    }

}


class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}



public class ProdCons
{

    public static void main(String arg[])
    {

    }
}