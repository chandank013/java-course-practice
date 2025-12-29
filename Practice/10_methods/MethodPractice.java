import java.lang.*;



public class MethodPractice {
    
    static int max(int x,int y)   // when methods are called then respective parameter is copied 
    {
        if(x>y)
            return x;
        else 
            return y;
    }

    
    static void inc(int x)
    {
        x++; // it will not change the value of main variabl becouse is passing to the methods
        System.out.println(x);
    }
    
    public static void main(String[] args) {
    
        // // by using static method
        // int a=10,b=15;
        // System.out.println(max(a,b));
        
        
        // // By creating an object of class then calling of method
        // MethodPractice mp=new MethodPractice();
        // System.out.println(mp.max(a,b));
        

        // int a=10,b=15;
        // inc(a);
        // System.out.println(a);
        
        
    }
    }
    