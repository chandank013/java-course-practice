import java.lang.*;

// Overloading can happen in same class
// Overriding can happen in different class in inheritence
//(Method Overloading is used for Compile time polymorphism)
//(Method Overriding is used for Run time polymorphism)


class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    @Override   // Not required, but recommended for safety and clarity.
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Override1
{
    public static void main(String[] args) 
    {
        Super s=new Super();
        s.display();

        // Super s=new Sub();  // method will called on the basis of object not on references (Dynamic method dispatch)
        // s.display();

        Sub s1=new Sub();
        s1.display();
          
    }    
}

