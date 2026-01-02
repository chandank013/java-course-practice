import java.lang.*;

class outer
{
   
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("Hello!");
            }
        }

        new Inner().show();  // object without references i.e called anynomous class
    }
}

public class LocalInner1
{
    public static void main(String[] args)
    {
        outer o=new outer();
        o.display();
    }
}