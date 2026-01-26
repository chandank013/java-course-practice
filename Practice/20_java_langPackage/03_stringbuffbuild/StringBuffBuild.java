import java.lang.*;


public class StringBuffBuild
{
    public static void main(String[] args) 
    {
        String s1=new String("Hello");  // it remain same not modify.
        
        StringBuffer s2=new StringBuffer("Hello");  // it get modify.
        
        StringBuilder s3=new StringBuilder("Hello");   // it get modify.
        
        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }   
}