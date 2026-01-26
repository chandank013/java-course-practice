import java.lang.*;
import java.io.*;
import java.util.*;

public class ResourcesDemo 
{
    
    static void Divide() throws Exception
    {
        try(FileInputStream fi=new FileInputStream("C:/Users/Arjun/05_Udemy_Java/Practice/18_exceptional_Handling/06_resourcesdemo/reso.txt");
        // limit the resources inside the try block and object will automtically created for this block and the closed.

        Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        

        //int x=sc.nextInt();
       // System.out.println(x);
        
    }
    
}