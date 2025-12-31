import java.lang.*;

abstract class KFC
{

    // constructor
    KFC()   // KFC will tell how to setup outlet ( Becouse the man who take franchisis(Mykfc will not able to decide how to set outlet and makeItem))
    {
        System.out.println("This Is Restrurent KFC");
    }

    void MakeItem()  // KFC will tell how to MakeItem
    {
        System.out.println("Place your Order");
    }
    

    // these can decide by the person who take franchasis
    abstract void billing();
    abstract void offer();  // time to time it will come


}

class MyKFC extends KFC
{

    // constructor
    public MyKFC()
    {
        System.out.println("This Is Restrurent MyKFC");
    }

    // Methods
    void billing()  // but i can add my own billing method
    {
        System.out.println("Pay your Ammount.");
    }

    void offer()   // but i can add my own offer
    {
        System.out.println("Today's offer is 50% off.");
    }

    void FestiveOffer()   // but i can add my own festiveoffer
    {
        System.out.println("Festive offer is Buy one get one free.");
    }

}


public class Kfc1
{

    public static void main(String[] args)
    {
        KFC kfcRef = new MyKFC(); // Abstract class reference, subclass object
        kfcRef.MakeItem();
        kfcRef.billing();
        kfcRef.offer();
        // kfcRef.FestiveOffer(); // Not accessible, unless you cast to MyKFC
    }
        
    
}