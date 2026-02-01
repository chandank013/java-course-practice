import java.lang.*;
import java.util.*;


/*
class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}

public class Annotation
{
    static List l;
    @SuppressWarnings("unchecked")  // Unsafe warning that was showing get suppressed now using annotation.


    // @SuppressWarnings("deprecation")
    public static void main(String[] args) 
    {
        l.add(10);

        // B b=new B();
        // b.show();
    }
    
}*/



/*// For @SafeVarargs  (method should must be private.)

class My<T>
{
    @SafeVarargs
    private void show(T...arg)
    {
        for(T x:arg)
        {
            System.out.println(x);
        }
    }
}

public class Annotation
{
    public static void main(String[] args) 
    {
       
    }
    
}*/


// For @FunctionalInterface   (If interface will not functional then compiler will give warnning the interface is not functional)  also provide msg if i write more than 1 method in interface

@FunctionalInterface
interface My1
{
    public void show();
    // public int add(int a, int b);

}

public class Annotation
{
    public static void main(String[] args) 
    {
       
    }
    
}