import java.lang.*;

// Overloading can happen in same class
// Overriding can happen in different class in inheritence
//(Method Overloading is used for Compile time polymorphism)
//(Method Overriding is used for Run time polymorphism)


class Test
{
    public int max(int a,int b)
    {
        return a>b?a:b;  // ternary Operator used at the place of (if-else) condition.
    }
    
    public int max(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}

public class Overloading1 
{
    public static void main(String[] args) 
    {
        Test t=new Test();
        System.out.println(t.max(10,5));
        System.out.println(t.max(10,15,5));
        
        
        
    }
    
}