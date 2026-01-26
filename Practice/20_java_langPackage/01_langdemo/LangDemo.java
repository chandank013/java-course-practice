import java.lang.*;  // Object Class


class MyObject  // Any object directly and indirectly inheriting form Object class becouse on creating object of any class having same methods
{
    public String toString()
    {
        return "MyObject";
    }
    public int hashCode()
    {
        return 100; // we have responsibility of generating unique code java will not take responsibility. 
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode(); 
    }
}


public class LangDemo
{

    public static void main(String args[])
    {
        // Object O1=new Object();
        // Object O2=new Object();

        // System.out.println(O1);

        // System.out.println(O1.equals(O1));
        // System.out.println(O1.equals(O2));
        // System.out.println(O1.hashCode());


        MyObject o1=new MyObject();   // Object of overriding methods.
        MyObject o2=new MyObject();
        System.out.println(o1);
        System.out.println(o1.equals(o2));

    }
}