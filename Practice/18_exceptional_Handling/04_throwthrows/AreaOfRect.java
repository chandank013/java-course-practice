import java.lang.*;

// public class AreaOfRect
// {
//     static int area(int l,int b) throws Exception
//     {
//         if(l<0 || b<0)
//         {
//             throw new Exception();
//         }
//         return l*b;
//     }
//     static void meth1() throws Exception
//     {
//         System.out.println("Area is: "+area(-10,5));
//     }
   
//     public static void main(String args[]) throws Exception
//     {
//         try{
//         meth1();
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//     }
// }




// Instead of throwing an object of calss exception we can define our own exception

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle could not be Negative.";
    }
}

public class AreaOfRect
{
    static int area(int l,int b) throws NegativeDimensionException
    {
        if(l<0 || b<0)
        {
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println("Area is: "+area(-10,5));
    }
   
    public static void main(String args[]) throws NegativeDimensionException
    {
        try{
        meth1();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
}
