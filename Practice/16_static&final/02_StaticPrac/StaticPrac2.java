import java.lang.*;



class Test
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
        System.out.println("Block 2");
    }
}

public class StaticPrac2 {

    
    
    static
    {
        System.out.println("Block 1");
    }
    
    
    public static void main(String[] args) 
    {
        Test t=new Test();  // Only on creating object class get executed

        System.out.println("Main");

        // Test t=new Test();
    }
    
    static
    {
    System.out.println("Block 2");
    } 
    
}