import java.lang.*;


abstract class My   // we can also take interface at place of abstract.
{
    abstract public void show();
}

class outer
{
   
    public void display()
    {
        // object without references i.e called anynomous class
        new My(){public void show(){System.out.println("Hello");}}.show();
        

        // My m=new My(){public void show(){System.out.println("Hello")}};
        // m.show();
    }
}

public class Anonymous1
{
    public static void main(String[] args)
    {
        outer o=new outer();
        o.display();
    }
}