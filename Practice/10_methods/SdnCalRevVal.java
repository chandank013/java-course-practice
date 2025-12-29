import java.lang.*;
import java.util.*;


public class SdnCalRevVal 
{
    
    
    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    
    
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }
    
    
    static int reverse(int n)
    {
        int rev=0;
        
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    
    
    static int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
    }
    
    
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    
    static double area(double length,double breadth)
    {
        return length*breadth;
    }
    


    public static void main(String[] args) 
    {

        System.out.println(validate("Chandan Kumar"));

        System.out.println(validate(5));

        System.out.println(reverse(456));

        int A[]={3,6,4,8,58,5};
        System.out.println(Arrays.toString(reverse(A)));


        System.out.println(area(7.0));

        System.out.println(area(7.0,8.0));
    } 
    
      
}