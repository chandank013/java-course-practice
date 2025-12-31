import java.lang.*;

// Dynamic method Dispatch is used for runtime polymorphism using method overriding

class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.err.println("Sub Meth2");
    }
    
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class DynamicDispatch1
{
    public static void main(String[] args) 
    {
        Super sup=new Sub();
       
        sup.meth1();
        sup.meth2();

        
    }   
}