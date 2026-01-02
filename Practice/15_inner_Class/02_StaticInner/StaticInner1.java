import java.lang.*;


//02. static inner class  ( it is ststic member of outer class {static class uses only static member of outer class not other member}. it can also direclty access out side outer class)


class Outer
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            // System.out.println(x); // it will not be printed

            System.out.println(y);  // it will print becouse static class access only the static member of outer class
        }
    }
    
    
}

public class StaticInner1 
{
    public static void main(String[] args) 
    {
        Outer.My m=new Outer.My();
        m.show();

    }
    
}