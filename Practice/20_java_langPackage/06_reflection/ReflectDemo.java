import java.lang.*;
import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}

public class ReflectDemo 
{
    public static void main(String[] args) 
    {
        // My m=new My();  // By creating object access the class 
        // Class c1=m.getClass();

        // OR
        Class c=My.class;
        
        // Field field[]=c.getDeclaredFields();   // Provide all the Properties.

        // for(Field f:field)
        //     System.out.println(f);
        
        // Constructor con[]=c.getConstructors();   // Provide all the Constructors.

        // for(Constructor ct:con)
        //     System.out.println(ct);
        
        Method meth[]=c.getMethods();   // Provide all the Methods.
        
        for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();   // Provide all the Parameters.
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }
        
    }   
}