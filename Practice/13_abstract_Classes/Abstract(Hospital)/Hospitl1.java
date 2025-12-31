import java.lang.*;

abstract class Hospital
{

    abstract void emegency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();


}

class Myhospital extends Hospital
{

    // constructor
    public Myhospital()
    {

    }

    // Methods
    void emegency()
    {

    }

    void appointment()
    {

    }

}


public class Hospital1
{

    public static void main(String[] args)
    {
        Hospital h1;  // references of abstract class
    }
}