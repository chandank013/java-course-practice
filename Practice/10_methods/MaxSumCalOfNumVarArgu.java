import java.lang.*;


public class MaxSumCalOfNumVarArgu 
{

    static int max(int ...A)
    {
        if(A.length==0) return Integer.MIN_VALUE;

        int m=A[0];
        for(int i=0; i<A.length;i++)
        {
            if (A[i]>m)
            {
                m=A[i];
            }
        }
        return m;
    }



    static int Sum(int ...A)
    {
        int sum =0;
        for(int i=0; i<A.length;i++)
        {
            sum+=A[i];
        }
        return sum;
    }



    static double discount(double ...A)
    {
        double price =0;
        for(int i=0; i<A.length;i++)
        {
            double rem =(A[i]-(A[i]*0.2));
            price+=rem;
        }
        return price;
    }


    public static void main(String arg[])
    {
        // System.out.println(max());
        // System.out.println(max(10));
        // System.out.println(max(10,20));
        // System.out.println(max(10,20,30));
        // System.out.println(max(new int[]{3,4,6,5,667,5,12}));


        // System.out.println(Sum());
        // System.out.println(Sum(10));
        // System.out.println(Sum(10,20));
        // System.out.println(Sum(10,20,30));
        // System.out.println(Sum(new int[]{3,4,6,5,667,5,12}));



        System.out.println(discount());
        System.out.println(discount(100.0));
        System.out.println(discount(100.0,200.0));
        System.out.println(discount(100.0,200.0,300.0));
        System.out.println(discount(new double[]{10.0,40.0,60.0,50.0,60.0,80.0}));
    }
}