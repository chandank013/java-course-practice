import java.lang.*;


abstract class Super   // Abstract class
{

    // constructor
    public Super() { System.out.println("Super Constructor"); }
    
    // method
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    //abstract method
    abstract public void meth2();
}

class Sub extends Super  // concrete class due to it inherited and override
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}
public class AbstractExample1 
{
    public static void main(String[] args) 
    {
        Super s=new Sub();  // we are able to create object becouse the inherited class is overriding the abstract method.
        s.meth1();
        s.meth2();
    }    
}