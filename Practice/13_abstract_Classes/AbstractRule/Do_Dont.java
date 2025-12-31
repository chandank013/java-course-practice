import java.lang.*;

// Bastract class cannot be final becouse after becoming final it cannot be extend
abstract class Super
{
    abstract public void meth1();
}

class Sub extends Super
{
    public void meth1()
    {
        
    }
}

public class Do_Dont {

    public static void main(String[] args) {
        
        Super s;
        s=new Super();  // we can take refrences but cannot 
        
        
    }
    
}